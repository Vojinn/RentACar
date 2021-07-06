/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validator;

import exception.ValidationException;

/**
 *
 * @author Vojin
 */
public interface IValidator {
    void validate(Object object) throws ValidationException;
}
