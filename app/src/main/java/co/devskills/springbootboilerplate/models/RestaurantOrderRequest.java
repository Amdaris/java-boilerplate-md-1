package co.devskills.springbootboilerplate.models;

public class RestaurantOrderRequest {
    private String order;

    // Default constructor
    public RestaurantOrderRequest() {
    }

    // Constructor with parameters
    public RestaurantOrderRequest(String order) {
        this.order = order;
    }

    // Getter and setter methods
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}