package com.gyuanaBank.accounts.controller;

import com.gyuanaBank.accounts.constants.AccountsConstants;
import com.gyuanaBank.accounts.dto.CustomerDto;
import com.gyuanaBank.accounts.dto.ResponseDto;
import com.gyuanaBank.accounts.service.IAccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api", produces = {MediaType.APPLICATION_JSON_VALUE})
public class AccountsController {

    @Autowired
    private IAccountsService iAccountsService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto) {

        iAccountsService.createAccount(customerDto);

        return ResponseEntity.
                status(HttpStatus.CREATED)
                .body( new ResponseDto(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201));
    }
}
