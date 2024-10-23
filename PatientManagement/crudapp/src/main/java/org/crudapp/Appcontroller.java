package org.crudapp;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class appcontroller {

    // UserController.java
    @RestController
    @RequestMapping("/api/users")
    public class UserController {
        @Autowired
        private appservices.UserService userService;

        @PostMapping
        public ResponseEntity<User> registerUser(@RequestBody User user) {
            User registeredUser = userService.registerUser(user);
            return ResponseEntity.ok(registeredUser);
        }

        @GetMapping("/login")
        public ResponseEntity<?> loginUser(@RequestParam String username, @RequestParam String password) {
            if (userService.validateCredentials(username, password)) {
                // Generate JWT token
                String token = generateJwtToken(username);
                return ResponseEntity.ok(new JwtResponse(token));
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
            }
        }

        // Add more methods for user management
    }
}
