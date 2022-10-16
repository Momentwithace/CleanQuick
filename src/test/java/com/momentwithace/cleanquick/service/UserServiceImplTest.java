package com.momentwithace.cleanquick.service;

import com.momentwithace.cleanquick.data.dtos.request.CustomerRegisterRequest;
import com.momentwithace.cleanquick.data.dtos.response.CustomerRegisterResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class UserServiceImplTest {
    @Autowired
    private UserService userService;

    private CustomerRegisterRequest userRegisterRequest;

    @BeforeEach
    void setUp() {
        userRegisterRequest = CustomerRegisterRequest.builder()
                .country("Kenya")
                .email("augustineezekiel763@gmail.com")
                .firstName("Ace")
                .password("12345")
                .build();
    }


    @Test
    void register() {
        CustomerRegisterResponse userRegisterResponse = userService.register(userRegisterRequest);
        assertThat(userRegisterResponse).isNotNull();
        assertThat(userRegisterResponse.getMessage()).isNotNull();
        assertThat(userRegisterResponse.getUserId()).isGreaterThan(0);
        assertThat(userRegisterResponse.getCode()).isEqualTo(201);
    }

    @Test
    void login() {
    }

    @Test
    void serviceRequest() {
    }

    @Test
    void updateProfile() {
    }

    @Test
    void changePassword() {
    }

    @Test
    void makePayment() {
    }

    @Test
    void serviceSearch() {
    }

    @Test
    void logOut() {
    }

    @Test
    void builder() {
    }
}