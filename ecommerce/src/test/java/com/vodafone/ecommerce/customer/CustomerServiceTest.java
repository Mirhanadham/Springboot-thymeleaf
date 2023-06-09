package com.vodafone.ecommerce.customer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class CustomerServiceTest {
    @Mock
    private CustomerDao customerDao;
    private CustomerService customerServiceUnderTest;
    @Mock
    private PasswordEncoder passwordEncoder;

    @BeforeEach
    void setUp(){
        customerServiceUnderTest = new CustomerService(customerDao,passwordEncoder);
    }

}