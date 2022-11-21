package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderChecked extends AbstractEvent {

    private Long id;

    public OrderChecked(Order aggregate){
        super(aggregate);
    }
    public OrderChecked(){
        super();
    }
}
