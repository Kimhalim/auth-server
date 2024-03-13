package com.codedrop.authserver.controller;

import com.codedrop.authserver.Enum.ResponseCode;
import com.codedrop.authserver.dto.ResponseDto;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @title Health Check
 * @author Odilio Noronha Filho
 */
@RestController
@RequestMapping(path = "/v1")
public class HealthCheckController {

    @GetMapping("/health")
    public ResponseDto healthCheck() {
        Map<String, Object> result = new HashMap<>();
        result.put("message", "health checker");
        return new ResponseDto(ResponseCode.SUCCESS, "health checker", result);
    }
}