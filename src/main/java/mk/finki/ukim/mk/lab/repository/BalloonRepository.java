package mk.finki.ukim.mk.lab.repository;

import mk.finki.ukim.mk.lab.bootstrap.DataHolder;
import mk.finki.ukim.mk.lab.model.Balloon;
import mk.finki.ukim.mk.lab.model.Order;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BalloonRepository {

//    public static List<Balloon> balloonList = new ArrayList<>(10);



    public List<Balloon> findAllBalloons(){
        return DataHolder.balloonList;
    }

    public List<Balloon> findAllByNameOrDescription(String text){
        return DataHolder.balloonList.stream().filter(i->i.getName().contains(text)
        || i.getDescription().contains(text)).collect(Collectors.toList());
    }





}
//sort by name,da nema baloni so isto ime
//dodadi svojstvo type vo Balloon,type e numeracija i da se filtrira spored type na pochetnata strana