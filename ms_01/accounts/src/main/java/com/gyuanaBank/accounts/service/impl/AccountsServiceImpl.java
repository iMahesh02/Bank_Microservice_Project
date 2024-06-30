package com.gyuanaBank.accounts.service.impl;

import com.gyuanaBank.accounts.constants.AccountsConstants;
import com.gyuanaBank.accounts.dto.CustomerDto;
import com.gyuanaBank.accounts.entity.Accounts;
import com.gyuanaBank.accounts.entity.Customer;
import com.gyuanaBank.accounts.exception.CustomerAlreadyExistsException;
import com.gyuanaBank.accounts.mapper.CustomerMapper;
import com.gyuanaBank.accounts.repository.AccountsRepository;
import com.gyuanaBank.accounts.repository.CustomerRepository;
import com.gyuanaBank.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {
        Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());

        /* checking if the same mobile number already exists */
        Optional<Customer> optionalCustomer = customerRepository.findByMobileNumber(customer.getMobileNumber());

        if (optionalCustomer.isPresent()) {
            throw new CustomerAlreadyExistsException("Customer already registered with given mobile number " + customerDto.getMobileNumber());
        }

        customer.setCreatedAt(LocalDateTime.now());
        customer.setCreatedBy("Admin");

        Customer savedCustomer = customerRepository.save(customer);

        /* Creating a bank account for customer */
        accountsRepository.save(createNewAccount(savedCustomer));
    }

    private Accounts createNewAccount(Customer customer)  {
        Accounts newAccount = new Accounts();
        newAccount.setCustomerId(customer.getCustomerId());
        long randomAccNumber = 10000000000L + new Random().nextInt(900000000);

        newAccount.setAccountNumber(randomAccNumber);
        newAccount.setAccountType(AccountsConstants.SAVINGS);
        newAccount.setBranchAddress(AccountsConstants.ADDRESS);
        newAccount.setCreatedAt(LocalDateTime.now());
        newAccount.setCreatedBy("Admin");
        return newAccount;
    }
}
