package com.momentwithace.cleanquick.repositories;

import com.momentwithace.cleanquick.data.models.VerificationToken;
import com.momentwithace.cleanquick.exception.VerificationTokenNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class VerificationTokenRepositoryTest {
    @Autowired
    private VerificationTokenRepository verificationTokenRepository;
    private VerificationToken verificationToken;

    @BeforeEach
    void setUP(){
        verificationToken = new VerificationToken();
        verificationToken.setToken("12345");
        verificationToken.setUserEmail("test@gmail.com");
    }

    @Test
    void findByUserEmail() {
        verificationTokenRepository.save(verificationToken);
        VerificationToken foundToken =
                verificationTokenRepository.findByUserEmail("test@gmail.com").orElseThrow(()->
        new VerificationTokenNotFoundException("Token not found"));
        assertThat(foundToken).isNotNull();
        assertThat(foundToken.getToken()).isEqualTo(verificationToken.getToken());
    }

    @Test
    void findByToken() {
    }
}