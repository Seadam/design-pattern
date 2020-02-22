package construct.factory.simplefactory;

/**
 * @Author: Archer
 * @Date: 2020/2/20
 * @Description:
 * @Version: 1.0
 */
public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制java视频");
    }
}
