package com.example.AMS.service;

import com.example.AMS.model.MaintenanceForm;
import com.example.AMS.repository.MaintenanceFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaintenanceFormService {
    @Autowired
    private MaintenanceFormRepository maintenanceFormRepository;

    public List<MaintenanceForm> getAllMaintenanceForms() {
        return maintenanceFormRepository.findAll();
    }

    public Optional<MaintenanceForm> getMaintenanceFormById(Long id) {
        return maintenanceFormRepository.findById(id);
    }

    public MaintenanceForm saveMaintenanceForm(MaintenanceForm maintenanceForm) {
        return maintenanceFormRepository.save(maintenanceForm);
    }

    public void deleteMaintenanceForm(Long id) {
        maintenanceFormRepository.deleteById(id);
    }
}