package com.example.AMS.repository;

import com.example.AMS.model.MaintenanceForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaintenanceFormRepository extends JpaRepository<MaintenanceForm, Long> {
}