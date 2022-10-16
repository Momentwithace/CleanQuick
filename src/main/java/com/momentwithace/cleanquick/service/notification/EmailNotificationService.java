package com.momentwithace.cleanquick.service.notification;

import com.momentwithace.cleanquick.data.dtos.request.EmailNotificationRequest;

public interface EmailNotificationService {
    String sendHtmlMail(EmailNotificationRequest emailNotificationRequest);
}
