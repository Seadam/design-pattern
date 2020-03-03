package structure.proxy.dynamic.jdk;

/**
 * @Author: Archer
 * @Date: 2020/3/2
 * @Description: 真实主题类
 * @Version: 1.0
 */
public class RealSubject implements Subject{
    @Override
    public void doSomething() {
        System.out.println("realsubject do sth");
    }
}
