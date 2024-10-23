package org.crudapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Patientrepository extends JpaRepository<Userandpatientmodels.Patient, Long> {
    List<Userandpatientmodels.Patient> findByUserId(Long userId);
}

