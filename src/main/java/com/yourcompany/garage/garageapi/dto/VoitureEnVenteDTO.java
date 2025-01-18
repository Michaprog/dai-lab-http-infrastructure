package com.yourcompany.garage.garageapi.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class VoitureEnVenteDTO {

    private String numeroChassis;
    private String marque;
    private String typeCarrosserie;
    private String couleur;
    private BigDecimal prix;
    private int nombrePortes;
    private int puissance;
    private BigDecimal consommation;
    private boolean neuf;
    private boolean garantie;
    private LocalDate dateFinGarantie;

    // Constructor matching the query result
    public VoitureEnVenteDTO(String numeroChassis, String marque, String typeCarrosserie, String couleur, BigDecimal prix,
                             int nombrePortes, int puissance, BigDecimal consommation, boolean neuf, boolean garantie, LocalDate dateFinGarantie) {
        this.numeroChassis = numeroChassis;
        this.marque = marque;
        this.typeCarrosserie = typeCarrosserie;
        this.couleur = couleur;
        this.prix = prix;
        this.nombrePortes = nombrePortes;
        this.puissance = puissance;
        this.consommation = consommation;
        this.neuf = neuf;
        this.garantie = garantie;
        this.dateFinGarantie = dateFinGarantie;
    }

    // Getters and setters
    // ...
}