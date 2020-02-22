package construct.factory.simplefactory;

/**
 * @Author: Archer
 * @Date: 2020/2/20
 * @Description: 所谓万能工厂,工厂职责过重,不便于扩展复杂的产品结构
 * @Version: 1.0
 */
public class CourseFactory {

    public ICourse create(Class<? extends ICourse> clazz) {
        try {
            if (clazz != null) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
