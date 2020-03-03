package structure.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: Archer
 * @Date: 2020/3/2
 * @Description: jdk动态代理
 *              采用字节重组,重新生成对象替换原来对象
 *              获取被代理对象的引用,并且获取其实现的所有接口,反射获取
 *              动态代理生成新的类,同时新的类实现被代理类的所有接口
 *              动态生成java代码,新加的业务逻辑由加进去的新代码实现
 *              编译生成新的java字节码文件
 *              加载到jvm中运行
 * @Version: 1.0
 */
public class JDKProxy implements InvocationHandler {

    private Object target;  //代理目标对象

    public JDKProxy(Object target){
        this.target = target;
    }

    public <T> T getProxyInstance(){
        Class<?> clazz = target.getClass();
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("do sth before");
        Object result = method.invoke(target, args);
        System.out.println("do sth after");
        return result;
    }
}
