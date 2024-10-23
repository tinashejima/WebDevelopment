package org.crudapp;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public class appservices {


    // AppService.java
    @Repository
    public class AppService {
        @Autowired
        private apprepository.apprepository apprepository;

        public User registerUser(User user) {
            return org.crudapp.apprepository.save(user);
        }

        public boolean validateCredentials(String username, String password) {
            User user = apprepository.findByUsername(username);
            return user != null && user.getPassword().equals(password);
        }
    }


    // PatientService.java
    @Repository
    public class PatientService {
        @Autowired
        private patientrepository.patientrepository patientrepository;

        public userandpatientmodels.Patient registerPatient(userandpatientmodels.Patient patient) {
            return patientrepository.save(patient);
        }

    }
}
