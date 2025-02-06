package com.eazybytes.accounts.controller;

import com.eazybytes.accounts.constants.AccountsConstants;
import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.dto.ResponseDto;
import com.eazybytes.accounts.entity.Customer;
import com.eazybytes.accounts.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.*;

@RestController
@RequestMapping(path="/api",produces ={APPLICATION_JSON_VALUE} )
public class AccountsController {

    @Autowired
    CustomerRepository customerRepository;

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> saveCustomer(@RequestBody CustomerDto customerDto){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(AccountsConstants.STATUS_201,AccountsConstants.MESSAGE_201));
    }
    @GetMapping("/connect")
    public String saveCustomer(){
        return "Hello Work!";
    }

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getAllCustomers(){
        List<Customer> customerList = customerRepository.findAll();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(customerList);

    }
}
