package com.gyuanaBank.accounts.service;

import com.gyuanaBank.accounts.dto.CustomerDto;

public interface IAccountsService {

    void createAccount(CustomerDto customerDto);
}
