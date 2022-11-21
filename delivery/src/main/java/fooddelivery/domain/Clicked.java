package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Clicked extends AbstractEvent {

    private Long id;

    public Clicked(Delivery aggregate){
        super(aggregate);
    }
    public Clicked(){
        super();
    }
}
