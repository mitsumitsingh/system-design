package sumit.lld.observerpattern.example1.observable;

import sumit.lld.observerpattern.example1.observer.ObserverInterface;

import java.util.LinkedList;
import java.util.List;

public class ObservableInterfaceImpl implements ObservableInterface{

    List<ObserverInterface> observerInterfaceList = new LinkedList<>();
    int data;
    @Override
    public void add(ObserverInterface obj) {
        observerInterfaceList.add(obj);
    }

    @Override
    public void remove(ObserverInterface obj) {
        observerInterfaceList.remove(obj);
    }

    @Override
    public void notifyObserver() {
        for(ObserverInterface obj : observerInterfaceList){
            obj.update();
        }
    }

    @Override
    public void setData(int data) {
        this.data = data;
        notifyObserver();
    }

    @Override
    public int getData() {
        return this.data;
    }
}
