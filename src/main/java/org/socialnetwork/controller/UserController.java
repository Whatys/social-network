package org.socialnetwork.controller;

import lombok.RequiredArgsConstructor;
import org.socialnetwork.models.User;

import org.socialnetwork.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {


private final UserService userService;


    @PostMapping("/createUser")
    public ResponseEntity<Long> saveUser(@Valid @RequestBody User user){
        return ResponseEntity.ok(userService.saveUser(user));
    }

    @DeleteMapping("deleteUser/{id}")
    public ResponseEntity<String>deleteUser(@PathVariable("id") Long user_id){
        userService.deleteUser(user_id);
        return ResponseEntity.ok("User deleted successfully.");
    }

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/getUser/{id}")
    public Optional<User> getUserById(@PathVariable("id") Long user_id) {
        return userService.getUserById(user_id);
    }

    @PutMapping("/updateUser/{id}")
    public ResponseEntity<String> updateUser(@PathVariable("id") Long user_id, @RequestBody User user){
        Optional<User> usrFromDb = userService.getUserById(user_id);
        return null;
    }






}
