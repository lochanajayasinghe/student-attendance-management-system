package com.example.AMS.service;


import com.example.Login.model.CondemnForm;
import com.example.AMS.repository.CondemnFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CondemnFormService {
    @Autowired
    private CondemnFormRepository condemnFormRepository;

    public List<CondemnForm> getAllCondemnForms() {
        return condemnFormRepository.findAll();
    }

    public Optional<CondemnForm> getCondemnFormById(Long id) {
        return condemnFormRepository.findById(id);
    }

    public CondemnForm saveCondemnForm(CondemnForm condemnForm) {
        return condemnFormRepository.save(condemnForm);
    }

    public void deleteCondemnForm(Long id) {
        condemnFormRepository.deleteById(id);
    }
}