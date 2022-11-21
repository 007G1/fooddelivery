package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StartedDelivery extends AbstractEvent {

    private Long id;

    public StartedDelivery(Orderprocess aggregate){
        super(aggregate);
    }
    public StartedDelivery(){
        super();
    }
}
