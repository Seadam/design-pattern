package construct.factory.factorymethod;

/**
 * @Author: Archer
 * @Date: 2020/2/20
 * @Description: 适用于创建对象需要大量重复代码的情形
 *               缺点是: 类的个数过多,增加复杂度
 * @Version: 1.0
 */
public interface ICourseFactory {

    public ICourse create();
}
