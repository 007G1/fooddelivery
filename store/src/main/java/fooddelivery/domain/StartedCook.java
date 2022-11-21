package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StartedCook extends AbstractEvent {

    private Long id;

    public StartedCook(Orderprocess aggregate){
        super(aggregate);
    }
    public StartedCook(){
        super();
    }
}
