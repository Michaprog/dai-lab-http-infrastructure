package com.yourcompany.garage.garageapi.entity;

import jakarta.persistence.*;
import java.util.Set;
import lombok.Data;

@Entity
@Table(name = "vendeur")
@PrimaryKeyJoinColumn(name = "noavs")
@Data
public class Vendeur extends Personnel {

    @OneToMany(mappedBy = "vendeur")
    private Set<Vente> ventes;

}
