package construct.singleton.ThreadLocal;

/**
 * @Author: Archer
 * @Date: 2020/2/23
 * @Description: ThreadLocal 保证线程中唯一的实例,天生线程安全
 * @Version: 1.0
 */
public class Singleton {

    private static final ThreadLocal<Singleton> INSTANCE = new ThreadLocal<Singleton>(){
        @Override
        protected Singleton initialValue() {
            return new Singleton();
        }
    };

    private Singleton(){};

    public Singleton getInstance(){
        return INSTANCE.get();
    }
}
