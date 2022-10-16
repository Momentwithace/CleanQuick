package com.momentwithace.cleanquick.service;

import com.momentwithace.cleanquick.data.dtos.request.NotificationRequest;

public interface NotificationService {
    String sendNotification(NotificationRequest notificationRequest);
}
