package construct.prototype.shallow;

import java.util.List;

/**
 * @Author: Archer
 * @Date: 2020/2/23
 * @Description: 浅克隆具体类
 * @Version: 1.0
 */
public class ConcretePrototype implements Prototype {

    private int age;
    private String name;
    private List hobbies;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public Prototype clone() {
        ConcretePrototype instance = new ConcretePrototype();
        instance.setAge(this.age);
        instance.setName(this.name);
        instance.setHobbies(this.hobbies);
        return instance;
    }
}
