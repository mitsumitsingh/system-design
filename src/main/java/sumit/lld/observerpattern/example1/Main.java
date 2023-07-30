package sumit.lld.observerpattern.example1;

import sumit.lld.observerpattern.example1.observable.ObservableInterface;
import sumit.lld.observerpattern.example1.observable.ObservableInterfaceImpl;
import sumit.lld.observerpattern.example1.observer.Observer1;
import sumit.lld.observerpattern.example1.observer.Observer2;
import sumit.lld.observerpattern.example1.observer.ObserverInterface;

public class Main {
    public static void main(String[] args) {
        ObservableInterface observableInterface = new ObservableInterfaceImpl();
        ObserverInterface observerInterface = new Observer1(observableInterface);
        ObserverInterface observerInterface1 = new Observer2(observableInterface);
        observableInterface.add(observerInterface);
        observableInterface.add(observerInterface1);
        observableInterface.setData(2);
        observableInterface.setData(3);
    }
}
