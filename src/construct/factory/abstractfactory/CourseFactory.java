package construct.factory.abstractfactory;

/**
 * @Author: Archer
 * @Date: 2020/2/20
 * @Description: 抽象工厂类 : 两个产品族(python和java) 两个产品结构(video和note)
 *                  每个产品族有自己的工厂
 *                  缺点是:扩展产品结构时需要修改接口, 不符合开闭原则
 * @Version: 1.0
 */
public interface CourseFactory {
    INote createNote();
    IVideo createVideo();
}
