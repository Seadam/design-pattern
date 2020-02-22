package construct.factory.abstractfactory.java;

import construct.factory.abstractfactory.CourseFactory;
import construct.factory.abstractfactory.INote;
import construct.factory.abstractfactory.IVideo;

/**
 * @Author: Archer
 * @Date: 2020/2/20
 * @Description:
 * @Version: 1.0
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
