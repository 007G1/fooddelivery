package fooddelivery.domain;

import fooddelivery.domain.Clicked;
import fooddelivery.domain.Picked;
import fooddelivery.DeliveryApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Delivery_table")
@Data

public class Delivery  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long orderId;
    
    
    
    
    
    private String orderState;

    @PostPersist
    public void onPostPersist(){


        Clicked clicked = new Clicked(this);
        clicked.publishAfterCommit();



        Picked picked = new Picked(this);
        picked.publishAfterCommit();

    }

    public static DeliveryRepository repository(){
        DeliveryRepository deliveryRepository = DeliveryApplication.applicationContext.getBean(DeliveryRepository.class);
        return deliveryRepository;
    }






}
