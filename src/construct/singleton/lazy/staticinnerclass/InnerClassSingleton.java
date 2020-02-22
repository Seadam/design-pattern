package construct.singleton.lazy.staticinnerclass;

/**
 * @Author: Archer
 * @Date: 2020/2/23
 * @Description: 解决了饿汉模式的内存浪费以及synchronize的性能问题
 *               静态内部类其实和外部类的静态变量，静态方法一样，
 *               只要被调用了都会让外部类的被加载。不过当只调用外部类的静态变量，静态方法时，
 *               是不会让静态内部类的被加载
 * @Version: 1.0
 */
public class InnerClassSingleton {

    private InnerClassSingleton(){}

    public InnerClassSingleton getInstance(){
        return LazyHolder.SINGLETON;
    }

    private static class LazyHolder{
        private static final InnerClassSingleton SINGLETON = new InnerClassSingleton();
    }
}
