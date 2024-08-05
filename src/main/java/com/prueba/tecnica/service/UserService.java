/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.tecnica.service;

import com.prueba.tecnica.model.User;
import java.util.Optional;
import java.util.List;

/**
 *
 * @author KRISTHIAN
 */
public interface UserService {
    
    public List<User> findUserAll();
    public User createUser(User user);
    public User updateUser(User user);
    public void deleteUser(Long id);
    public Optional<User> getUser(Long id);
    
}
