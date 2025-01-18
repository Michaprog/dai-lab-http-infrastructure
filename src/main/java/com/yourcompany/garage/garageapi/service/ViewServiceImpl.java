package com.yourcompany.garage.garageapi.service;

import com.yourcompany.garage.garageapi.dto.VoitureEnVenteDTO;
import com.yourcompany.garage.garageapi.repository.ViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewServiceImpl implements ViewService {

    private final ViewRepository viewRepository;

    public ViewServiceImpl(ViewRepository viewRepository) {
        this.viewRepository = viewRepository;
    }

    @Override
    public List<VoitureEnVenteDTO> getCarsInSale(){
        return viewRepository.findAllCarsInSale();
    }

}
