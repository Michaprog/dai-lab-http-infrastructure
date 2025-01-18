package com.yourcompany.garage.garageapi.repository;

import com.yourcompany.garage.garageapi.dto.VoitureEnVenteDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ViewRepository extends JpaRepository<VoitureEnVenteDTO, Integer> {

    @Query(value = "SELECT * FROM vue_voitures_en_vente", nativeQuery = true)
    List<VoitureEnVenteDTO> findAllCarsInSale();

}
