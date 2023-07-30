package sumit.lld.observerpattern.example2;

import sumit.lld.observerpattern.example2.observable.InventoryObservable;
import sumit.lld.observerpattern.example2.observable.IphoneObservableImpl;
import sumit.lld.observerpattern.example2.observer.EmailAlertObserver;
import sumit.lld.observerpattern.example2.observer.MobileAlertObserver;
import sumit.lld.observerpattern.example2.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        InventoryObservable inventoryObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserver("user1@gmail.com", inventoryObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("user2@gmail.com", inventoryObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("+91 2343234543", inventoryObservable);

        inventoryObservable.add(observer1);
        inventoryObservable.add(observer2);
        inventoryObservable.add(observer3);

        inventoryObservable.setInventoryCount(5); // All Observers will be notified as the initial inventory count is 0;

        inventoryObservable.setInventoryCount(4); // No Observers will be notified as inventory items are still there
        inventoryObservable.setInventoryCount(0);

        inventoryObservable.setInventoryCount(5); // All Observers will be notified as the initial inventory count is 0;
    }
}
