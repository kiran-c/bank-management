package com.mybank.bankmanagement.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BeneficiaryDTO {


    private Long id;

    @NotNull(message = "this filed is mandatory")
    @NotEmpty(message = "Not be Empty")
    private String bankName;

    private String customerName;

    @NotNull(message = "this filed is mandatory")
    @NotEmpty(message = "Not be Empty")
    @Size(min = 5, max = 10)
    private Long IFSCCode;

    @NotNull(message = "this filed is mandatory")
    @NotEmpty(message = "Not be Empty")
    private Long accNo;


}
