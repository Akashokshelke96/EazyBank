package com.eazybytes.accounts.service.impl;

import com.eazybytes.accounts.constants.AccountsConstants;
import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.entity.Accounts;
import com.eazybytes.accounts.entity.Customer;
import com.eazybytes.accounts.exception.CustomerAlreadyExistsException;
import com.eazybytes.accounts.mapper.CustomerMapper;
import com.eazybytes.accounts.repository.AccountRepository;
import com.eazybytes.accounts.repository.CustomerRepository;
import com.eazybytes.accounts.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class AccountServiceImpl  implements IAccountService {
    
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    AccountRepository accountRepository;
    
    @Override
    public void createAccount(CustomerDto customerDto) {
    // here now we need a mapper to convert the above customerDto to a Customer object, since
        // repository will consume Customer object
        Optional<Customer> existingCustomer = customerRepository.findByMobileNumber(customerDto.getMobileNumber());
        if(existingCustomer.isPresent()){
            throw new CustomerAlreadyExistsException("Customer Already exists. " + customerDto.getMobileNumber() );
        }
        Customer customer = CustomerMapper.mapToCustomer(customerDto,new Customer());
        Customer savedCustomer = customerRepository.save(customer);
        accountRepository.save(createNewAccount(savedCustomer));
    }

    private Accounts createNewAccount(Customer customer){
        Accounts newAccount = new Accounts();
        newAccount.setCustomerId(customer.getCustomerId());
        long randomAccNumber = 10000000000L + new Random().nextInt(900000000);
        newAccount.setAccountType(AccountsConstants.SAVINGS);
        newAccount.setAccountNumber(randomAccNumber);
        newAccount.setBranchAddress(AccountsConstants.ADDRESS);
        return newAccount;
    }
}
