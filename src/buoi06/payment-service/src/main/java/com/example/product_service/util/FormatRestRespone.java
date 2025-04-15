package com.example.product_service.util;

import com.example.product_service.dtos.response.RestResponse;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * File: FormatRestRespone.java
 * Author: Le Van Hoang
 * Date: 4/8/2025 (08/04/2025)
 * Time: 7:49 PM
 * Version: 1.0
 * <p>
 * Copyright © 2025 Le Van Hoang. All rights reserved.
 */

@ControllerAdvice
public class FormatRestRespone implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }


    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        HttpServletResponse servletResponse = ((ServletServerHttpResponse) response).getServletResponse();
        int status = servletResponse.getStatus();
        RestResponse<Object> restResponse = new RestResponse<>();
        restResponse.setStatusCode(status);
        if (body instanceof String) {
            return body;
        }
//        String path = request.getURI().getPath();
//        if (path.startsWith("/v3/api-docs") || path.startsWith("/swagger-ui")) {
//            return body;
//        }
        if (status >= 400) {
            return body;
        } else {
            restResponse.setData(body);
            restResponse.setMessage("SUCCESS API RESPONSE");
        }
        return restResponse;
    }
}


