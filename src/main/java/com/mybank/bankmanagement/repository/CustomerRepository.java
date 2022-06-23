package com.mybank.bankmanagement.repository;


import com.mybank.bankmanagement.entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {

    Optional<CustomerEntity> findByEmailAndPassword(String email, String password);
    Optional<CustomerEntity> findByEmail(String email);
}
