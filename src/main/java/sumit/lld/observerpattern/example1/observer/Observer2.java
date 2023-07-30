package sumit.lld.observerpattern.example1.observer;

import sumit.lld.observerpattern.example1.observable.ObservableInterface;

public class Observer2 implements ObserverInterface{
        ObservableInterface observableInterface;
        public Observer2(ObservableInterface observableInterface){
            this.observableInterface = observableInterface;
        }
        @Override
        public void update() {
            System.out.println("Observer2 called... Some change is detected... data is changed to " + observableInterface.getData());
        }
}
