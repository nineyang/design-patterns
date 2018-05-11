package Observer;

/**
 * User: Nine
 * Date: 2018/5/11
 * Time: 下午4:09
 */


public class TestObserver implements Observer {

    private Subject subject;
    /**
     * @param args
     */
    public static void main(String[] args) {

    }

    public TestObserver(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update() {

    }
}
