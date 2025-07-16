package com.example.Login.controller;

import com.example.Login.model.CondemnForm;
import com.example.Login.service.CondemnFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/condemn-forms")
public class CondemnFormController {
    @Autowired
    private CondemnFormService condemnFormService;

    @GetMapping
    public List<CondemnForm> getAllCondemnForms() {
        return condemnFormService.getAllCondemnForms();
    }

    @GetMapping("/{id}")
    public Optional<CondemnForm> getCondemnFormById(@PathVariable Long id) {
        return condemnFormService.getCondemnFormById(id);
    }

    @PostMapping
    public CondemnForm createCondemnForm(@RequestBody CondemnForm condemnForm) {
        return condemnFormService.saveCondemnForm(condemnForm);
    }

    @PutMapping("/{id}")
    public CondemnForm updateCondemnForm(@PathVariable Long id, @RequestBody CondemnForm condemnForm) {
        condemnForm.setId(id);
        return condemnFormService.saveCondemnForm(condemnForm);
    }

    @DeleteMapping("/{id}")
    public void deleteCondemnForm(@PathVariable Long id) {
        condemnFormService.deleteCondemnForm(id);
    }
}