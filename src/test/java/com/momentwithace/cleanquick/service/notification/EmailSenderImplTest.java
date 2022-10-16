package com.momentwithace.cleanquick.service.notification;

import com.momentwithace.cleanquick.data.dtos.request.EmailNotificationRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class EmailSenderImplTest {

    @Autowired
    private EmailNotificationService emailSender;

    @Test
    void sendHtmlMail() {
        EmailNotificationRequest emailDetails = new EmailNotificationRequest();
        emailDetails.setUserEmail("augustineezekiel763@gmail.com");
        emailDetails.setMailContent("Hello, Amazing Customer....");
        String response = emailSender.sendHtmlMail(emailDetails);
        assertThat(response.contains("Successfully")).isTrue();


    }
}