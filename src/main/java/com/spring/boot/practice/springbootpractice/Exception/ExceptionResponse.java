package com.spring.boot.practice.springbootpractice.Exception;

import java.util.Date;

/**
 * Created by hemanthponnuru on 2019-07-30
 */
public class ExceptionResponse {

    private String message;

    private String details;

    private Date timestamp;

    public ExceptionResponse(Date timestamp, String message, String details) {
        this.message = message;
        this.details = details;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

    public Date getTimestamp() {
        return timestamp;
    }
}
