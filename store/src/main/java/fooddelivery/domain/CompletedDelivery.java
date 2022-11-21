package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CompletedDelivery extends AbstractEvent {

    private Long id;

    public CompletedDelivery(Orderprocess aggregate){
        super(aggregate);
    }
    public CompletedDelivery(){
        super();
    }
}
