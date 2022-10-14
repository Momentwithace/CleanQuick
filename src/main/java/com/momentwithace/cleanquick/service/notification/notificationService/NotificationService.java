package com.momentwithace.cleanquick.service.notification.notificationService;

import com.momentwithace.cleanquick.data.dtos.request.NotificationRequest;

public interface NotificationService {
    String sendNotification(NotificationRequest notificationRequest);
}
