package S_single_responsibilty_principle;

import S_single_responsibilty_principle.Enitity.Invoice;
import S_single_responsibilty_principle.Enitity.Marker;
import S_single_responsibilty_principle.Printer.InvoicePrinter;
import S_single_responsibilty_principle.StorageDB.InvoiceDB;

import java.util.ArrayList;

public class Main {
    /*
    * Single Responsibility Principle (Class should have Only ONE reason to change)
    *
    * ==> Easily Maintainable
    * ==> Easy to understand
    *
    *
    * */
    public static void main(String[] args) {
        Marker marker = new Marker("red",400,false);
        Invoice invoice = new Invoice(marker);
        InvoiceDB db = new InvoiceDB();


        db.saveToDB(invoice);
        InvoicePrinter printer = new InvoicePrinter(invoice);
        printer.printInvoice();
    }
}
