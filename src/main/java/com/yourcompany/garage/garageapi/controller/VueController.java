package com.yourcompany.garage.garageapi.controller;

import com.yourcompany.garage.garageapi.dto.VoitureEnVenteDTO;
import com.yourcompany.garage.garageapi.service.ViewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/view")
public class VueController {

    private final ViewService viewService;

    public VueController(ViewService viewService) {
        this.viewService = viewService;
    }

    @GetMapping("/voituresEnVente")
    public List<VoitureEnVenteDTO> getVoituresEnVente() {
        return  viewService.getCarsInSale();
    }

}
