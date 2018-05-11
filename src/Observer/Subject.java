package Observer;

/**
 * User: Nine
 * Date: 2018/5/11
 * Time: 下午4:10
 */


public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();
}
