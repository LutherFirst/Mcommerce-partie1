/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author luther
 */
@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class ProduitGratuitException extends RuntimeException{
    public ProduitGratuitException(String s) {
        super(s);
    }
    
}
