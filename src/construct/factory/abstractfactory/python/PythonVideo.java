package construct.factory.abstractfactory.python;

import construct.factory.abstractfactory.IVideo;

/**
 * @Author: Archer
 * @Date: 2020/2/20
 * @Description:
 * @Version: 1.0
 */
public class PythonVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制python视频");
    }
}
