package Observer;

import java.util.ArrayList;

/**
 * User: Nine
 * Date: 2018/5/11
 * Time: 下午4:11
 */


public class Weather implements Subject {

    private ArrayList observers;

    public Weather() {
        observers = new ArrayList();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);

        if (index > 0) observers.remove(index);
    }

    @Override
    public void notifyObserver() {
        observers.forEach((observer) -> {
            //            todo something
            Observer o = (Observer) observer;
            o.update();
        });
    }
}
