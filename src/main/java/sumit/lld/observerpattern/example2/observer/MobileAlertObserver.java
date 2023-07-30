package sumit.lld.observerpattern.example2.observer;

import sumit.lld.observerpattern.example2.observable.InventoryObservable;

public class MobileAlertObserver implements NotificationAlertObserver{

    InventoryObservable inventoryObservable;
    String mobileNo;

    public MobileAlertObserver(String mobileNo, InventoryObservable inventoryObservable){
        this.inventoryObservable = inventoryObservable;
        this.mobileNo = mobileNo;
    }
    @Override
    public void update() {
        sendMobileAlert();
    }

    public void sendMobileAlert(){
        System.out.println("Send mobile alert to :: " + mobileNo);
    }
}
