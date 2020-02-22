package construct.singleton.hungry;

/**
 * @Author: Archer
 * @Date: 2020/2/22
 * @Description: 先静态,后动态
 *               先属性,后方法
 *               从上到下
 * @Version: 1.0
 */
public class HungrySingleton {

    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return singleton;
    }

}
