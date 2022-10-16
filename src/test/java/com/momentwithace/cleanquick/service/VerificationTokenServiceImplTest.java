package com.momentwithace.cleanquick.service;

import com.momentwithace.cleanquick.data.models.VerificationToken;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
@SpringBootTest
class VerificationTokenServiceImplTest {
    @Autowired
    private VerificationTokenService verificationTokenService;


    @Test
    void generateVerificationToken() {
        VerificationToken verificationToken =
                verificationTokenService.generateVerificationToken("augustineezekiel763@gmail.com");
        assertThat(verificationToken.getToken().length()).isEqualTo(5);
    }
}