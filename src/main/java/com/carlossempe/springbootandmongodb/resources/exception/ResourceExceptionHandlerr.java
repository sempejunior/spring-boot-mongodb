package com.carlossempe.springbootandmongodb.resources.exception;

import com.carlossempe.springbootandmongodb.services.exception.ObjectNotFoundException;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandlerr {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity <StandardError> objectNotFound (ObjectNotFoundException e, HttpServletRequest request){
        HttpStatus status = HttpStatus.NOT_FOUND;

        StandardError standardError = new StandardError (System.currentTimeMillis (),status.value (),"Not found.", e.getMessage (),request.getRequestURI () );
        return ResponseEntity.status(status).body (standardError);
    }
}
