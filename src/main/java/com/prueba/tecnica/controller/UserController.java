/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.tecnica.controller;

import com.prueba.tecnica.exception.ModelNotFoundException;
import com.prueba.tecnica.model.User;
import com.prueba.tecnica.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KRISTHIAN
 */
@RestController
@RequestMapping("/Users")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping(produces = "application/json")
    public ResponseEntity<List<User>> listar() {
            List<User> users = new ArrayList<>();
            users = userService.findUserAll();
            return new ResponseEntity<>(users, HttpStatus.OK);
    }
	
    @PostMapping
    public ResponseEntity<User> crearUser(@Valid @RequestBody User user){
        userService.createUser(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long id){
            User User= userService.getUser(id).orElseThrow(() -> new ModelNotFoundException("User no encontrado $id"));
            return new ResponseEntity<>(User, HttpStatus.OK);
    }
    
    
    @DeleteMapping("/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable("id") Long id){
            userService.deleteUser(id);
            return ResponseEntity.ok().build();
    }
    
    
    @PutMapping("/{id}")
    public User updateUser(@PathVariable("id") Long id, @Valid @RequestBody User user){
            User dbUser =  userService.getUser(id).orElseThrow(() -> new ModelNotFoundException("User No enocntrado"));
            dbUser.setName(user.getName());
            dbUser.setLastName(user.getLastName());
            dbUser.setIdentificationType(user.getIdentificationType());
            dbUser.setNumberIdentification(user.getNumberIdentification());
            return userService.updateUser(dbUser);
    }
	
    
}
