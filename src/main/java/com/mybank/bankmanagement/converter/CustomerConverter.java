package com.mybank.bankmanagement.converter;

import com.mybank.bankmanagement.dto.CustomerDTO;
import com.mybank.bankmanagement.entity.CustomerEntity;
import org.springframework.stereotype.Component;


@Component
public class CustomerConverter {


   public CustomerEntity convertDTOToEntity(CustomerDTO customerDTO)
    {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setId(customerDTO.getId());
        customerEntity.setEmail(customerDTO.getEmail());
        customerEntity.setName(customerDTO.getName());
        customerEntity.setPhone(customerDTO.getPhone());

        return customerEntity;
    }

   public CustomerDTO convertEntityToDTO(CustomerEntity customerEntity )
    {
        CustomerDTO customerDTO = new CustomerDTO();

        customerDTO.setId(customerEntity.getId());
        customerDTO.setEmail(customerEntity.getEmail());
        customerDTO.setName(customerEntity.getName());
        customerDTO.setPhone(customerEntity.getPhone());

        return customerDTO;
    }


}
