package org.crudapp;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface patientrepository {

    // PatientRepository.java
    public interface apprepository extends JpaRepository<userandpatientmodels.Patient, Long> {
        List<userandpatientmodels.Patient> findByUserId(Long userId);
    }

}
