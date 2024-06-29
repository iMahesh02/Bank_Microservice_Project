package com.gyuanaBank.accounts.service.impl;

import com.gyuanaBank.accounts.dto.CustomerDto;
import com.gyuanaBank.accounts.repository.AccountsRepository;
import com.gyuanaBank.accounts.repository.CustomerRepository;
import com.gyuanaBank.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
