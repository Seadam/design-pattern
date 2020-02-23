package construct.prototype.deep;

import java.io.*;
import java.util.Date;

/**
 * @Author: Archer
 * @Date: 2020/2/23
 * @Description:
 * @Version: 1.0
 */
public class SuperMan extends Monkey implements Cloneable, Serializable {

    public Stick stick;

    public SuperMan(){
        this.birthday = new Date();
        this.stick = new Stick();
    }

    @Override
    public Object clone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            SuperMan copy = (SuperMan) ois.readObject();
            copy.birthday = new Date();
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

}
