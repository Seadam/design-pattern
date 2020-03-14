package structure.proxy.dynamic.jdk;

/**
 * <pre>
 * 测试类
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
public class JdkProxyTest {

    public static void main(String[] args) {

        Subject proxy = (Subject) JdkProxyFactory.instance(new RealSubject());
        proxy.doSomething();
    }
}
