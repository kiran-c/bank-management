package com.mybank.bankmanagement.service.impl;

import com.mybank.bankmanagement.converter.BeneficiaryConverter;
import com.mybank.bankmanagement.converter.CustomerConverter;
import com.mybank.bankmanagement.dto.BeneficiaryDTO;
import com.mybank.bankmanagement.dto.CustomerDTO;
import com.mybank.bankmanagement.entity.BeneficiaryEntity;
import com.mybank.bankmanagement.entity.CustomerEntity;
import com.mybank.bankmanagement.exceptions.BusinessException;
import com.mybank.bankmanagement.exceptions.ErrorModel;
import com.mybank.bankmanagement.repository.CustomerRepository;
import com.mybank.bankmanagement.service.CustomerService;
import com.mycompany.propertymanagement.converter.UserConverter;
import com.mycompany.propertymanagement.dto.UserDTO;
import com.mycompany.propertymanagement.entity.UserEntity;
import com.mycompany.propertymanagement.exceptions.BusinessException;
import com.mycompany.propertymanagement.exceptions.ErrorModel;
import com.mycompany.propertymanagement.repository.UserRepository;
import com.mycompany.propertymanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    CustomerConverter customerConverter;

    @Autowired
    BeneficiaryConverter beneficiaryConverter;

    @Override
    public CustomerDTO register(CustomerDTO customerDTO)
    {

       Optional<CustomerEntity> customerEn =  customerRepository.findByEmail(customerDTO.getEmail());

       if(customerEn.isPresent())
       {

           List<ErrorModel> errorModelList = new ArrayList<>();
           ErrorModel errmodel = new ErrorModel();
           errmodel.setMessage("the Account with this email is already Exist");
           errmodel.setError("DUPLICATE_EMAIL_FND");

           errorModelList.add(errmodel);

           throw new BusinessException(errorModelList);
       }


        CustomerEntity customerEntity = customerConverter.convertDTOToEntity(customerDTO);

        customerEntity = customerRepository.save(customerEntity);
        customerDTO = customerConverter.convertEntityToDTO(customerEntity);
        return customerDTO;
    }

    @Override
    public CustomerDTO customerLogin(String email, String password) {

        Optional<CustomerEntity> optEn = customerRepository.findByEmailAndPassword(email, password);

        CustomerDTO customerDTO = null;

        if(optEn.isPresent())
        {
            customerDTO = customerConverter.convertEntityToDTO(optEn.get());

        }
        else{

            List<ErrorModel> errorModelList = new ArrayList<>();
            ErrorModel model = new ErrorModel();
            model.setError("INVALID_LOGIN");
            model.setMessage("Incorrect UserName or Passowrd...!");

            throw new BusinessException(errorModelList);

        }

        return customerDTO;
    }

    public BeneficiaryDTO saveBenificiary(BeneficiaryDTO beneficiaryDTO)
    {
        BeneficiaryEntity be = beneficiaryConverter.convertDTOToEntity(beneficiaryDTO);

        be =  customerRepository.save(be);

        beneficiaryDTO = beneficiaryConverter.convertEntityToDTO(be);

        return BeneficiaryDTO;
    }

}
