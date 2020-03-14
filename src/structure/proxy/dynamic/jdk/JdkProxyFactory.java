package structure.proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

/**
 * <pre>
 * jdk代理工厂类
 * </pre>
 *
 * @author wenbb1@meicloud.com
 * @version 1.00.00
 * <p>
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容:
 * </pre>
 */
public class JdkProxyFactory {

    /**
     * 获取代理类
     * @param target 被代理类
     * @param <T> ？
     * @return 代理类
     */
    public static <T> T instance(Object target) {
        Class<?> clazz = target.getClass();
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new JdkProxy(target));
    }
}
