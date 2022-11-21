package fooddelivery.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name="Orderspec_table")
@Data
public class Orderspec {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String state;


}