package org.example.solidprinciple;

/**
 * I - Interface Segmented Principle
 * => Interface should be such that client should not implement un-necessary functions they do not need.
 */
public class InterfaceSegmented {
}

interface RestaurantEmployee {
    public void serveCustomer();
    public void cookFood();
    public void takeOrder();
}

class Waiter implements RestaurantEmployee{

    @Override
    public void serveCustomer() {
        // Add implementation
    }

    @Override
    public void cookFood() {
        // add dummy implementation
    }

    @Override
    public void takeOrder() {
        // Add implementation
    }
}

/**
 * In the above example Waiter class have to provide the implementation of cookFood method, if it's implementing from RestaurantEmployee.
 *
 * So, to solve the above issue, we need to break interface into smaller pieces.
 */

interface WaiterInterface{
    public void serveCustomer();
    public void takeOrder();
}

interface ChefInterface{
    public void cookFood();
    public void decideMenu();
}

class Waiter1 implements WaiterInterface{

    @Override
    public void serveCustomer() {
        System.out.println("Serving the customer");
    }

    @Override
    public void takeOrder() {
        System.out.println("Taking the orders");
    }
}

class Chef implements ChefInterface{

    @Override
    public void cookFood() {
        System.out.println("Preparing food");
    }

    @Override
    public void decideMenu() {
        System.out.println("Deciding the menu");
    }
}

/**
 * In the above case client of the interfaces(Waiter1, Chef) shouldn't have to implement any extra methods.
 */