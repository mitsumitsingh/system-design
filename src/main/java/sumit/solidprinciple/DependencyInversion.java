package sumit.solidprinciple;

/**
 * D - Dependency Inversion Principle
 * => A class should depend on interfaces rather than a concrete classes.
 *
 * => The dependency inversion principle states that high-level modules should not depend on low-level modules,
 *    but rather both should depend on abstractions.
 */
public class DependencyInversion {
}

interface Keyboard{
    public void onEnter();
}

class BluetoothKeyboard implements Keyboard{

    @Override
    public void onEnter() {

    }
}

class WiredKeyboard implements Keyboard{

    @Override
    public void onEnter() {

    }
}
class MacBook{
    private final WiredKeyboard wiredKeyboard;

    private final BluetoothKeyboard bluetoothKeyboard;

    public MacBook(){
        this.wiredKeyboard = new WiredKeyboard();
        this.bluetoothKeyboard = new BluetoothKeyboard();
    }

}

/**
 * Now let say, in future we introduced wireless keyboard, and we want to introduce wireless keyboard feature in the macbook class.
 *
 * To leverage that feature, we need to change our class. We need to add another variable and initialize that in the class.
 *
 * To get rid of that. We have to use interface reference everywhere.
 *
 * Eg :-
 */

class Wireless implements Keyboard{

    @Override
    public void onEnter() {

    }
}

class MacBook1{

    private final Keyboard keyboard;

    public MacBook1(Keyboard keyboard){
        /**
         *  In this case if we send the object of Wired keyboard then our class is capable to handle the feature of wired keyboard,
         *  if we send the object of wireless keyboard, it will be able to leverage the feature of wireless keyboard.
         */
        this.keyboard = keyboard;
    }

}

/**
 * We can see with the example that if we depend on abstraction, how easy to switch between the features.
 */