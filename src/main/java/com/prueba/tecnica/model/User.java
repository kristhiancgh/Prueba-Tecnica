/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.tecnica.model;

import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 *
 * @author KRISTHIAN
 */
@EqualsAndHashCode(callSuper=false)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="TBL_USER")
public class User {
    
    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqUser")
    @SequenceGenerator(name = "seqUser", allocationSize = 1, sequenceName = "SEQ_USER")
    @Builder.Default
    Long id=0L;
    @NotNull @NotBlank
    String name;
    @NotNull @NotBlank
    String lastName;
    
    Integer age;
    @NotBlank(message = "Email es requerido")
    @Size(min = 5, max = 50)
    String email;
    
    
}
