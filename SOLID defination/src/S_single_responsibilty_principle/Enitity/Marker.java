package S_single_responsibilty_principle.Enitity;

public class Marker {
    private String color;
    private Integer price;
    private Boolean permanentMarker;

    public Marker(String color, Integer price, Boolean permanentMarker) {
        this.color = color;
        this.price = price;
        this.permanentMarker = permanentMarker;
    }
    public Integer getPrice() {
        return price;
    }
    public  String getColor() {
        return color;
    }
    public Boolean isPermanentMarker() {
        return permanentMarker;
    }

}
