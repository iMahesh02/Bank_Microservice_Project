package com.gyuanaBank.accounts.service;

import com.gyuanaBank.accounts.dto.CustomerDto;
import com.gyuanaBank.accounts.entity.Customer;

public interface IAccountsService {

    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);
}
