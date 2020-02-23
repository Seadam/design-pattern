package construct.prototype.shallow;

/**
 * @Author: Archer
 * @Date: 2020/2/23
 * @Description: 克隆客户端
 * @Version: 1.0
 */
public class Client {

    private Prototype prototype;

    public Client(Prototype prototype){
        this.prototype = prototype;
    }

    public Prototype startClone(Prototype concretePrototype){
        return concretePrototype.clone();
    }
}
