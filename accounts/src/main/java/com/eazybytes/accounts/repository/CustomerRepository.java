package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    //These are called as derived named methods, used method names to create SQL queries to fetch data
    Optional<Customer> findByMobileNumber(String mobileNumber);
    Optional<Customer> findByMobileNumberAndName(String mobileNumber,String name);
    Optional<Customer> findByEmail(String name);


}
