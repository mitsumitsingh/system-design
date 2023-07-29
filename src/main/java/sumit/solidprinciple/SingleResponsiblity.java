package sumit.solidprinciple;

/**
 * S -> Single Responsibility Principle
 * A class should have only one reason to change.
 */
class SingleResponsiblity {
    public static void main(String[] args) {
        Marker marker = new Marker("test", "red", 2020, 20);
        Invoice1 invoice = new Invoice1(marker, 2);
        System.out.println(invoice.calculateTotal());
        InvoiceDao invoiceDao = new InvoiceDao(invoice);
        invoiceDao.saveToDB();
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
        invoicePrinter.print();
    }
}

class Marker{
    String name;
    String color;
    int year;
    int price;

    public Marker(String name, String color, int year, int price) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }

}

class Invoice{
    private Marker marker;
    private int quantity;
    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }
    public int calculateTotal(){
        int price = ((marker.price) * this.quantity);
        return price;
    }

    public void printInvoice(){
        // Logic to print invoice
        System.out.println("Printing the invoice...");
    }

    public void saveToDB(){
        // Logic to save to the database
        System.out.println("Save to DB...");
    }
}

/**
 * In the above example we can see that Invoice class has more than one responsiblity. It has the calculation logic,
 * printing logic and save to db logic
 *
 * Let's segregate this to achieve single responsibility principle
 */

class Invoice1{
    private Marker marker;
    private int quantity;
    public Invoice1(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }
    public int calculateTotal(){
        int price = ((marker.price) * this.quantity);
        return price;
    }

}

class InvoiceDao{
    Invoice1 invoice;
    public InvoiceDao(Invoice1 invoice){
        this.invoice = invoice;
    }

    public void saveToDB(){
        // Logic to save to db
        System.out.println("Save to DB...");
    }
}

class InvoicePrinter{
    private Invoice1 invoice;

    public InvoicePrinter(Invoice1 invoice){
        this.invoice = invoice;
    }

    public void print(){
        // print the invoice
        System.out.println("Printing the invoice...");
    }
}

/**
 * With this we can achieve
 * => Easy to maintain
 * => Easy to understand
 */