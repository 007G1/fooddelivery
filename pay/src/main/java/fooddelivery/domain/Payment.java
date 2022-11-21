package fooddelivery.domain;

import fooddelivery.domain.Payed;
import fooddelivery.domain.Refunded;
import fooddelivery.PayApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Payment_table")
@Data

public class Payment  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String state;
    
    
    
    
    
    private Integer cost;

    @PostPersist
    public void onPostPersist(){


        Payed payed = new Payed(this);
        payed.publishAfterCommit();



        Refunded refunded = new Refunded(this);
        refunded.publishAfterCommit();

    }

    public static PaymentRepository repository(){
        PaymentRepository paymentRepository = PayApplication.applicationContext.getBean(PaymentRepository.class);
        return paymentRepository;
    }






}
