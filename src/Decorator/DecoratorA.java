package Decorator;

/**
 * User: Nine
 * Date: 2018/7/8
 * Time: 下午5:52
 */


public class DecoratorA extends DecoratorBase {

    public DecoratorA(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public String echo() {
//        todo something
        return "decoratorA";
    }
}
