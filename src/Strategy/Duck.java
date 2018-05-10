package Strategy;

import Strategy.Behavior.FlyBehavior;

/**
 * User: Nine
 * Date: 2018/5/10
 * Time: 下午10:57
 */


public abstract class Duck {
    FlyBehavior flyBehavior;

    public void setFlyBehavier(FlyBehavior behavior) {
        this.flyBehavior = behavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }
}
