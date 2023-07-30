package sumit.lld.observerpattern.example2.observer;

import sumit.lld.observerpattern.example2.observable.InventoryObservable;

public class EmailAlertObserver implements NotificationAlertObserver{

    InventoryObservable inventoryObservable;
    String mailId;

    public EmailAlertObserver(String mailId, InventoryObservable inventoryObservable){
        this.inventoryObservable = inventoryObservable;
        this.mailId = mailId;
    }
    @Override
    public void update() {
        sendMail();
    }

    public void sendMail(){
        System.out.println("Send mail to mailId :: " + this.mailId);
    }
}
