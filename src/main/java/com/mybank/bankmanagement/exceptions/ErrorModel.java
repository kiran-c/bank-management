package com.mybank.bankmanagement.exceptions;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorModel {

    private String error;
    private String message;

}
