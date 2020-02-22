package construct.factory.simplefactory;

/**
 * @Author: Archer
 * @Date: 2020/2/20
 * @Description:
 * @Version: 1.0
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        ICourse pythonCourse = factory.create(PythonCourse.class);
        pythonCourse.record();
    }

}
