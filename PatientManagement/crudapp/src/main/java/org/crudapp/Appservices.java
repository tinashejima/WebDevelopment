package org.crudapp;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public class Appservices {


    public User registerUser(User user) {
        return user;
    }


    @Service
    public class AppService {
        @Autowired
        private Apprepository apprepository;

        public User registerUser(User user) {
            return apprepository.save(user);
        }

//        public boolean validateCredentials(String username, String password) {
//            User user = apprepository.findByUsername(username);
//            return user.getPassword().equals(password);
//        }
    }



     @Service
     public class PatientService {
         @Autowired
         private Patientrepository patientrepository;

         public Userandpatientmodels.Patient registerPatient(Userandpatientmodels.Patient patient) {
            return patientrepository.save(patient);
        }

    }
}
