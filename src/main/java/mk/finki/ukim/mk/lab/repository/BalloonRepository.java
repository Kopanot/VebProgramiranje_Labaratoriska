package mk.finki.ukim.mk.lab.repository;

import mk.finki.ukim.mk.lab.model.Balloon;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BalloonRepository {

    List<Balloon> balloonList = new ArrayList<>(10);

    public List<Balloon> findAllBalloons(){
        return balloonList;
    }

    public List<Balloon> findAllByNameOrDescription(String text){
        return balloonList.stream().filter(i->i.getName().contains(text)
        || i.getDescription().contains(text)).collect(Collectors.toList());
    }


}
