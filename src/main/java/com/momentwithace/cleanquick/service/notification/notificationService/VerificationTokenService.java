package com.momentwithace.cleanquick.service.notification.notificationService;

import com.momentwithace.cleanquick.data.models.VerificationToken;

public interface VerificationTokenService {
    VerificationToken generateVerificationToken(String userEmail);
}
