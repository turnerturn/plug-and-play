package com.turndawg.toolbox;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionListener {

    @ExceptionHandler(Exception.class)
    public void handleException(Exception e) {
        // handle the exception
    }

@ExceptionHandler(IllegalArgumentException.class)
public void handleIllegalArgumentException(IllegalArgumentException e) {
    // handle the exception
}

}

