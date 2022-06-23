package com.mybank.bankmanagement.repository;


import com.mybank.bankmanagement.entity.BeneficiaryEntity;
import com.mybank.bankmanagement.entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BeneficiaryRepository extends CrudRepository<BeneficiaryEntity, Long> {

    Optional<BeneficiaryEntity> findBycustomerNameAndaccNo(String cuatomerName, long accNo);
}
