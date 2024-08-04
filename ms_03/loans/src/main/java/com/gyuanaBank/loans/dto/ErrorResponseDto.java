package com.gyuanaBank.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Schema(
        name = "ErrorResponse",
        description = "Schema to hold error response information"
)
@Setter @Getter
@AllArgsConstructor
public class ErrorResponseDto {

    private String apiPath;
}
