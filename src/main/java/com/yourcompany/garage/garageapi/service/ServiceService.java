package com.yourcompany.garage.garageapi.service;

import com.yourcompany.garage.garageapi.dto.IdDTO;
import com.yourcompany.garage.garageapi.dto.ServiceDTO;
import com.yourcompany.garage.garageapi.dto.ServiceDTOnative;

import java.util.List;

public interface ServiceService {

    List<ServiceDTO> getAllServices();
    ServiceDTO getServiceById(Integer serviceID);

    void createService(ServiceDTOnative service);
    void deleteService(Integer serviceID);
}
