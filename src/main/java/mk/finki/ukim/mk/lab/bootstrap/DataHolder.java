package mk.finki.ukim.mk.lab.bootstrap;
import mk.finki.ukim.mk.lab.model.Balloon;
import mk.finki.ukim.mk.lab.model.Manufacturer;
import mk.finki.ukim.mk.lab.model.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    public static List<Balloon> balloonList = new ArrayList<>();
    public static List<Order> orderList = new ArrayList<>();
    public static List<Manufacturer> manufacturerList = new ArrayList<>(5);

    @PostConstruct  //da se povika init() metodot
    public void init(){
        balloonList.add(new Balloon("Red","Small"));
        balloonList.add(new Balloon("Blue","Extra Large"));
        balloonList.add(new Balloon("Yellow","Large"));
    }

}