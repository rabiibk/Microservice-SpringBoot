package tn.rabiibk.microservicestock.entities;




import entities.BaseEntity;
import lombok.*;


import javax.persistence.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Stock  extends BaseEntity {



    private String nameStock;
    private String description;
    private String zone;
    private String classification;

}

