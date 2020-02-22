package construct.factory.abstractfactory.python;

import construct.factory.abstractfactory.INote;

/**
 * @Author: Archer
 * @Date: 2020/2/20
 * @Description:
 * @Version: 1.0
 */
public class PythonNote implements INote {
    @Override
    public void edit() {
        System.out.println("编写python笔记");
    }
}
