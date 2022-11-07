package mk.finki.ukim.mk.lab.repository;

import mk.finki.ukim.mk.lab.model.Balloon;
import mk.finki.ukim.mk.lab.model.Order;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BalloonRepository {

    public static List<Balloon> balloonList = new ArrayList<>(10);
    @PostConstruct
    public void init(){
        balloonList.add(new Balloon("Crven","mnogu ubav"));
    }


    public List<Balloon> findAllBalloons(){
        return balloonList;
    }

    public List<Balloon> findAllByNameOrDescription(String text){
        return balloonList.stream().filter(i->i.getName().contains(text)
        || i.getDescription().contains(text)).collect(Collectors.toList());
    }




}
