package construct.singleton.lazy.doublecheck;

/**
 * @Author: Archer
 * @Date: 2020/2/23
 * @Description: 分配内存给这个对象
 *               初始化这个对象
 *               设置singleton指向刚分配的内存地址
 * @Version: 1.0
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton singleton = null;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getInstance(){
        if(singleton == null){
            synchronized (DoubleCheckSingleton.class){
                if(singleton == null){
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }


}
