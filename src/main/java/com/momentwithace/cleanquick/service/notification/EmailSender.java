package com.momentwithace.cleanquick.service.notification;

public interface EmailSender {
    String sendHtmlMail(EmailDetails emailDetails);
}
