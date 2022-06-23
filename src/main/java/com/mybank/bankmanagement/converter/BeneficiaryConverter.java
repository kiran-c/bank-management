package com.mybank.bankmanagement.converter;

import com.mybank.bankmanagement.dto.BeneficiaryDTO;
import com.mybank.bankmanagement.dto.CustomerDTO;
import com.mybank.bankmanagement.entity.BeneficiaryEntity;
import com.mybank.bankmanagement.entity.CustomerEntity;
import org.springframework.stereotype.Component;


@Component
public class BeneficiaryConverter {


   public BeneficiaryEntity convertDTOToEntity(BeneficiaryDTO beneficiaryDTO)
    {
        BeneficiaryEntity beneficiaryEntity = new BeneficiaryEntity();
        beneficiaryEntity.setId(beneficiaryDTO.getId());
        beneficiaryEntity.setAccNo(beneficiaryDTO.getAccNo());
        beneficiaryEntity.setBankName(beneficiaryDTO.getBankName());
        beneficiaryEntity.setCustomerName(beneficiaryDTO.getCustomerName());
        beneficiaryEntity.setIFSCCode(beneficiaryDTO.getIFSCCode());

        return beneficiaryEntity;
    }

   public CustomerDTO convertEntityToDTO(BeneficiaryEntity beneficiaryEntity )
    {
        BeneficiaryDTO beneficiaryDTO = new BeneficiaryDTO();

        beneficiaryDTO.setId(beneficiaryEntity.getId());
        beneficiaryDTO.setAccNo(beneficiaryEntity.getAccNo());
        beneficiaryDTO.setBankName(beneficiaryEntity.getBankName());
        beneficiaryDTO.setCustomerName(beneficiaryEntity.getCustomerName());
        beneficiaryDTO.setIFSCCode(beneficiaryEntity.getIFSCCode());

        return beneficiaryDTO;
    }


}
