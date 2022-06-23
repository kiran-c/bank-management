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
public class BeneficiaryEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    private String bankName;
    private String customerName;
    private Long IFSCCode;
    private Long accNo;
}
