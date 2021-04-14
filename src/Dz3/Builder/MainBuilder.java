package Dz3.Builder;

// Builder

import java.util.Date;

public class MainBuilder {

    public static void main(String[] args) {
        OrderBuilder orderBuilder = new OrderBuilder();
        orderBuilder
                .idOrder(1L)
                .dateOrder(new Date())
                .numberOrder(1)
                .itemOrder("Order item!!!")
                .descriptionOrder("DescriptionOrder");
        System.out.println(orderBuilder);
    }

}
