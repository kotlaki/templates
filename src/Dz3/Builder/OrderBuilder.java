package Dz3.Builder;

import java.util.Date;

public class OrderBuilder {
    private Long idOrder;
    private int numberOrder;
    private Date dateOrder;
    private String itemOrder;
    private String descriptionOrder;

    public OrderBuilder idOrder(Long id) {
        idOrder = id;
        return this;
    }

    public OrderBuilder numberOrder(int number) {
        numberOrder = number;
        return this;
    }

    public OrderBuilder dateOrder(Date date) {
        dateOrder = date;
        return this;
    }

    public OrderBuilder itemOrder(String item) {
        itemOrder = item;
        return this;
    }

    public OrderBuilder descriptionOrder(String description) {
        descriptionOrder = description;
        return this;
    }

    @Override
    public String toString() {
        return "OrderBuilder{" +
                "idOrder=" + idOrder +
                ", numberOrder=" + numberOrder +
                ", dateOrder=" + dateOrder +
                ", itemOrder='" + itemOrder + '\'' +
                ", descriptionOrder='" + descriptionOrder + '\'' +
                '}';
    }
}
