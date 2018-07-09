package Decorator;

/**
 * User: Nine
 * Date: 2018/7/8
 * Time: 下午5:56
 */


public class DecoratorBase implements Decorator {

    public Decorator decorator;

    public void DecoratorBase(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public String echo() {
        return null;
    }
}
