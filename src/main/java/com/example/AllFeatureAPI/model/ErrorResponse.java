package com.example.AllFeatureAPI.model;

import lombok.Data;

@Data
public class ErrorResponse {
    private int statusCode;
    private String message;
}
