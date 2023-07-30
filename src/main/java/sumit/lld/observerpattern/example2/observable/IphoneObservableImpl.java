package sumit.lld.observerpattern.example2.observable;

import sumit.lld.observerpattern.example2.observer.NotificationAlertObserver;

import java.util.LinkedList;
import java.util.List;

public class IphoneObservableImpl implements InventoryObservable{

    List<NotificationAlertObserver> notificationAlertObserverList = new LinkedList<>();

    private int inventoryCount = 0;
    @Override
    public void add(NotificationAlertObserver observer) {
        notificationAlertObserverList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        notificationAlertObserverList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver obj : notificationAlertObserverList){
            obj.update();
        }
    }

    @Override
    public void setInventoryCount(int newCount) {
        if(inventoryCount == 0){
            notifySubscribers();
        }
        this.inventoryCount = newCount;
    }

    @Override
    public int getInventoryCount() {
        return this.inventoryCount;
    }
}
