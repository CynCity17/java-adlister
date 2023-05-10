package pizzamodels;

public class PostPizzaOrder {
    private String size;
    private String crust;
    private String sauce;
    private String[] toppings;
    private String street;
    private String city;
    private String state;
    private String zip;

    public PostPizzaOrder(){

    }
    public PostPizzaOrder(String size, String crust, String sauce, String[] toppings, String street, String city, String state, String zip) {
        this.size = size;
        this.crust = crust;
        this.sauce = sauce;
        this.toppings = toppings;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
