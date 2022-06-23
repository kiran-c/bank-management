package com.mybank.bankmanagement.controller;


import com.mybank.bankmanagement.dto.BeneficiaryDTO;
import com.mybank.bankmanagement.dto.CustomerDTO;
import com.mybank.bankmanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/customer")
public class CustomerContoller {

    @Autowired
    CustomerService customerService;

    @PostMapping("/register")
    public ResponseEntity<CustomerDTO> register(@Valid @RequestBody CustomerDTO customerDTO)
    {
        customerDTO = customerService.register(customerDTO);

        return new ResponseEntity<>(customerDTO, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<CustomerDTO> login(@Valid @RequestBody CustomerDTO customerDTO)
    {
        customerDTO = customerService.customerLogin(customerDTO.getEmail(), customerDTO.getPassword());

        return new ResponseEntity<>(customerDTO, HttpStatus.CREATED);
    }

    @PostMapping("/benificiary")
    public  ResponseEntity<CustomerDTO> saveBenificiary(@RequestBody BeneficiaryDTO beneficiaryDTO)
    {
        BeneficiaryDTO dto  =  customerService.saveBenificiary(BeneficiaryDTO);

        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

}
