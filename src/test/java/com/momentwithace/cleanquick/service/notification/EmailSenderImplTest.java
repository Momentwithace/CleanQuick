package com.momentwithace.cleanquick.service.notification;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EmailSenderImplTest {

    @Autowired
    private EmailSender emailSender;

    @Test
    void sendHtmlMail() {
        EmailDetails emailDetails = new EmailDetails();
        emailDetails.setUserEmail("augustineezekiel763@gmail.com");
        emailDetails.setMailContent("Hello, Amazing Customer....");
        String response = emailSender.sendHtmlMail(emailDetails);
        assertThat(response.contains("Successfully")).isTrue();


    }
}