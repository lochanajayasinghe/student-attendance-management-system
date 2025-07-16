package com.example.AMS.controller;

import com.example.AMS.model.MaintenanceForm;
import com.example.AMS.service.MaintenanceFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/maintenance-forms")
public class MaintenanceFormController {
    @Autowired
    private MaintenanceFormService maintenanceFormService;

    @GetMapping
    public List<MaintenanceForm> getAllMaintenanceForms() {
        return maintenanceFormService.getAllMaintenanceForms();
    }

    @GetMapping("/{id}")
    public Optional<MaintenanceForm> getMaintenanceFormById(@PathVariable Long id) {
        return maintenanceFormService.getMaintenanceFormById(id);
    }

    @PostMapping
    public MaintenanceForm createMaintenanceForm(@RequestBody MaintenanceForm maintenanceForm) {
        return maintenanceFormService.saveMaintenanceForm(maintenanceForm);
    }

    @PutMapping("/{id}")
    public MaintenanceForm updateMaintenanceForm(@PathVariable Long id, @RequestBody MaintenanceForm maintenanceForm) {
        maintenanceForm.setId(id);
        return maintenanceFormService.saveMaintenanceForm(maintenanceForm);
    }

    @DeleteMapping("/{id}")
    public void deleteMaintenanceForm(@PathVariable Long id) {
        maintenanceFormService.deleteMaintenanceForm(id);
    }
}
