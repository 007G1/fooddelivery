package fooddelivery.domain;

import fooddelivery.domain.Accepted;
import fooddelivery.domain.Rejected;
import fooddelivery.domain.StartedCook;
import fooddelivery.domain.CompletedCook;
import fooddelivery.domain.StartedDelivery;
import fooddelivery.domain.CompletedDelivery;
import fooddelivery.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Orderprocess_table")
@Data

public class Orderprocess  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String state;

    @PostPersist
    public void onPostPersist(){


        Accepted accepted = new Accepted(this);
        accepted.publishAfterCommit();



        Rejected rejected = new Rejected(this);
        rejected.publishAfterCommit();



        StartedCook startedCook = new StartedCook(this);
        startedCook.publishAfterCommit();



        CompletedCook completedCook = new CompletedCook(this);
        completedCook.publishAfterCommit();



        StartedDelivery startedDelivery = new StartedDelivery(this);
        startedDelivery.publishAfterCommit();



        CompletedDelivery completedDelivery = new CompletedDelivery(this);
        completedDelivery.publishAfterCommit();

    }

    public static OrderprocessRepository repository(){
        OrderprocessRepository orderprocessRepository = StoreApplication.applicationContext.getBean(OrderprocessRepository.class);
        return orderprocessRepository;
    }






}
