package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CompletedCook extends AbstractEvent {

    private Long id;

    public CompletedCook(Orderprocess aggregate){
        super(aggregate);
    }
    public CompletedCook(){
        super();
    }
}
