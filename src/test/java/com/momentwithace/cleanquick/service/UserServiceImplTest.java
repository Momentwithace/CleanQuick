package com.momentwithace.cleanquick.service;

import com.momentwithace.cleanquick.data.dtos.request.UserRegisterRequest;
import com.momentwithace.cleanquick.data.dtos.response.UserRegisterResponse;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceImplTest {
    @Autowired
    private UserService userService;

    private UserRegisterRequest userRegisterRequest;

    @BeforeEach
    void setUp() {
        userRegisterRequest = UserRegisterRequest.builder()
                .country("Kenya")
                .email("testing@gmail.com")
                .password("12345")
                .build();
    }


    @Test
    void register() {
        UserRegisterResponse userRegisterResponse = userService.register(userRegisterRequest);
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