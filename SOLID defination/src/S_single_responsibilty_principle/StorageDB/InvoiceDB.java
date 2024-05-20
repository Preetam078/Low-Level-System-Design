package S_single_responsibilty_principle.StorageDB;

import S_single_responsibilty_principle.Enitity.Invoice;
import S_single_responsibilty_principle.Enitity.Marker;

import java.util.ArrayList;

public class InvoiceDB {
    private ArrayList<Invoice>DB;
    public InvoiceDB() {
        DB = new ArrayList<Invoice>();
    }
    //Later this class is only dependent on the save Db function..........(IMP)
    public void saveToDB(Invoice invoice) {
        DB.add(invoice);
    }
    public ArrayList<Invoice> getAllInvoice() {
        return DB;
    }
}
