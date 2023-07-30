package sumit.lld.observerpattern.example1.observable;

import sumit.lld.observerpattern.example1.observer.ObserverInterface;

public interface ObservableInterface {
    public void add(ObserverInterface obj);
    public void remove(ObserverInterface obj);
    public void notifyObserver();
    public void setData(int data);
    public int getData();

}
