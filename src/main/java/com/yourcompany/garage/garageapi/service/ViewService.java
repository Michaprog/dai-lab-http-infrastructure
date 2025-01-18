// VoitureService.java
package com.yourcompany.garage.garageapi.service;

import com.yourcompany.garage.garageapi.dto.*;


import java.util.List;

public interface ViewService {

    List<VoitureEnVenteDTO> getCarsInSale();

}