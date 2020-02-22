package construct.factory.abstractfactory.java;

import construct.factory.abstractfactory.INote;

/**
 * @Author: Archer
 * @Date: 2020/2/20
 * @Description:
 * @Version: 1.0
 */
public class JavaNote implements INote {
    @Override
    public void edit() {
        System.out.println("编写java笔记");
    }
}
