package fooddelivery.infra;
import fooddelivery.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class OrderprocessHateoasProcessor implements RepresentationModelProcessor<EntityModel<Orderprocess>>  {

    @Override
    public EntityModel<Orderprocess> process(EntityModel<Orderprocess> model) {

        
        return model;
    }
    
}
