package com.gyuanaBank.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class ResponseDto {

    private String statusCode;

    private String statusMsg;

    public ResponseDto(String statusCode, String statusMsg) {

    }
}
