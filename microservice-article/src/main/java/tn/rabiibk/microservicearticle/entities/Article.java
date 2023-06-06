package tn.rabiibk.microservicearticle.entities;

import entities.BaseEntity;
import lombok.*;

import javax.persistence.Entity;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Article extends BaseEntity {


    private Long idStock;
    private String name;
    private String quantity;
}
