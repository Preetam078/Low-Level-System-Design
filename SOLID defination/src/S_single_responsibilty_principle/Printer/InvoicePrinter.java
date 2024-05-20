package S_single_responsibilty_principle.Printer;

import S_single_responsibilty_principle.Enitity.Invoice;

public class InvoicePrinter {
    private Invoice invoice;
    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }
    public void printInvoice() {
        System.out.println("The Amount for mark is ..."+invoice.getInvoiceAmount());
    }
}

