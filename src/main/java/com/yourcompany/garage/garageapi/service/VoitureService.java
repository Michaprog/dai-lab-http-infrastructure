// VoitureService.java
package com.yourcompany.garage.garageapi.service;

import com.yourcompany.garage.garageapi.entity.Voiture;
import com.yourcompany.garage.garageapi.entity.TypeCarrosserie;
import com.yourcompany.garage.garageapi.entity.TypeCouleurs;
import com.yourcompany.garage.garageapi.entity.TypeCombustible;
import com.yourcompany.garage.garageapi.entity.TypeBoiteVitesse;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface VoitureService {

    List<Voiture> getAllVoitures();

    Optional<Voiture> getVoitureByNumeroChassis(String numeroChassis);

    Voiture updateVoiture(String numeroChassis, Voiture voitureDetails);

    void deleteVoiture(String numeroChassis);

    // Additional methods for custom queries

    List<Voiture> getVoituresByMarque(String marque);

    List<Voiture> getVoituresByTypeCarrosserie(String typeCarrosserie);

    List<Voiture> searchVoitures(
            Optional<String> marque,
            Optional<TypeCarrosserie> typeCarrosserie,
            Optional<TypeCouleurs> couleur,
            Optional<TypeCombustible> typeCombustible,
            Optional<TypeBoiteVitesse> typeBoiteVitesse,
            Optional<Boolean> enVente,
            Optional<Boolean> neuf,
            Optional<BigDecimal> prixMin,
            Optional<BigDecimal> prixMax,
            Optional<LocalDate> startDate,
            Optional<LocalDate> endDate,
            Optional<Integer> nombreKm
    );


    // -----INSERTION-----

    public void insertVoiture(Voiture voiture);
}