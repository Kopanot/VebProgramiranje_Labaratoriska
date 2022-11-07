package mk.finki.ukim.mk.lab.repository;

import mk.finki.ukim.mk.lab.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {
    List<Order> orderList = new ArrayList<>(10);



    public Order placeOrder(String balloonColor, String clientName, String address){
        Order order = new Order(balloonColor,clientName,address);
        orderList.add(order);
        return order;
    }


}
