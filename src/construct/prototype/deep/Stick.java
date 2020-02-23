package construct.prototype.deep;

import java.io.Serializable;

/**
 * @Author: Archer
 * @Date: 2020/2/23
 * @Description:
 * @Version: 1.0
 */
public class Stick implements Serializable {

    public float h = 100;
    public float d = 10;

    public void big(){
        this.h *= 2;
        this.d *=2;
    }

    public void small(){
        this.h /=2;
        this.d /=2;
    }
}
