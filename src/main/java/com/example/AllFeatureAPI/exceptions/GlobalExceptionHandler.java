package com.example.AllFeatureAPI.exceptions;

import com.example.AllFeatureAPI.model.ErrorResponse;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler{

    @ExceptionHandler({UserAlreadyExistsException.class})
    public ErrorResponse handleUserAlreadyExistsException(UserAlreadyExistsException userAlreadyExistsException) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatusCode(400);
        errorResponse.setMessage(userAlreadyExistsException.getMessage());

        return errorResponse;
    }

    @ExceptionHandler({IncorrectCredentialsException.class})
    public ErrorResponse handleIncorrectCredentialsException(IncorrectCredentialsException incorrectCredentialsException) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatusCode(401);
        errorResponse.setMessage(incorrectCredentialsException.getMessage());

        return errorResponse;
    }
}
