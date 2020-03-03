package structure.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: Archer
 * @Date: 2020/3/3
 * @Description:
 * @Version: 1.0
 */
public class CglibProxy implements MethodInterceptor {

    public Object getProxyInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);  //设置为代理类的父类
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("执行前");
        Object obj = methodProxy.invokeSuper(o,objects);
        System.out.println("执行后");
        return obj;
    }
}
