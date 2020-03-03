package structure.proxy.staticproxy;

/**
 * @Author: Archer
 * @Date: 2020/3/1
 * @Description:
 * @Version: 1.0
 */
public class Father implements Person{

    private Son son;

    public Father(Son son){
        this.son = son;
    }

    @Override
    public void findLove() {
        System.out.println("帮儿子物色对象");
        this.son.findLove();
        System.out.println("确定关系");
    }
}
