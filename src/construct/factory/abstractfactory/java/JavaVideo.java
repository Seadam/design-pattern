package construct.factory.abstractfactory.java;

import construct.factory.abstractfactory.IVideo;

/**
 * @Author: Archer
 * @Date: 2020/2/20
 * @Description:
 * @Version: 1.0
 */
public class JavaVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制java视频");
    }
}
