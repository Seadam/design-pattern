package construct.factory.factorymethod;

/**
 * @Author: Archer
 * @Date: 2020/2/20
 * @Description:
 * @Version: 1.0
 */
public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制python视频");
    }
}
