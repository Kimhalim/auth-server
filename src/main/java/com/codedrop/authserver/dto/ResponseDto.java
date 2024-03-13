package com.codedrop.authserver.dto;

import com.codedrop.authserver.Enum.ResponseCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {

    private ResponseCode code;
    private String message;
    private Object  data;

}
