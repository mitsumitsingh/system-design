package sumit.lld.observerpattern.example2.observable;

import sumit.lld.observerpattern.example2.observer.NotificationAlertObserver;

public interface InventoryObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();
    public void setInventoryCount(int newCount);
    public int getInventoryCount();
}
