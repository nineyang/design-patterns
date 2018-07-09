package Decorator;

/**
 * User: Nine
 * Date: 2018/7/8
 * Time: 下午5:53
 */


public class ComponentA implements Decorator {

    @Override
    public String echo() {
        return "ComponentA";
    }
}
