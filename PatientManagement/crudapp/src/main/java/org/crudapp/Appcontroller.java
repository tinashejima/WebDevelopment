package org.crudapp;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class Appcontroller {


    @RestController
    @RequestMapping("/api/users")
    public class UserController {
        @Autowired
        private Appservices appservices;

        @PostMapping
        public ResponseEntity<User> registerUser(@RequestBody User user) {
            User registeredUser = appservices.registerUser(user);
            return ResponseEntity.ok(registeredUser);
        }

//        @GetMapping("/login")
//        public ResponseEntity<?> loginUser(@RequestParam String username, @RequestParam String password) {
//            if (appservices.validateCredentials(username, password)) {
//
//
//                String token = generateJwtToken(username);
//                return ResponseEntity.ok(new JwtResponse(token));
//            } else {
//                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
//            }
//        }
//
//    }
    }
}
