package S_single_responsibilty_principle.Enitity;

public class Invoice {
    private Integer price;
    public  Invoice(Marker marker) {
        this.price = marker.getPrice();
    }
    public Integer getInvoiceAmount() {
        return price;
    }
}
