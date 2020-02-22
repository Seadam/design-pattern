package construct.factory.factorymethod;

/**
 * @Author: Archer
 * @Date: 2020/2/20
 * @Description:
 * @Version: 1.0
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
       return new PythonCourse();
    }
}
