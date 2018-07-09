package Decorator;

/**
 * User: Nine
 * Date: 2018/7/9
 * Time: 上午10:38
 */


public class Test {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ComponentA componentA = new ComponentA();
        DecoratorA decoratorA = new DecoratorA(componentA);
    }
}
