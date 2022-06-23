package com.mybank.bankmanagement.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "BENEFICIARY_TABLE")
@Setter
@Getter
@NoArgsConstructor
public class CustomerEntity {


    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private Long phone;
    private String password;


}
