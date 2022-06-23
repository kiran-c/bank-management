package com.mybank.bankmanagement.service;

import com.mybank.bankmanagement.dto.BeneficiaryDTO;
import com.mybank.bankmanagement.dto.CustomerDTO;

public interface CustomerService {

    CustomerDTO register(CustomerDTO customerDTO);
    CustomerDTO customerLogin(String email, String password);

    CustomerDTO saveBenificiary(BeneficiaryDTO beneficiaryDTO);
}
