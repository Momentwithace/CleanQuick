package com.momentwithace.cleanquick.service.notification.notificationService;

import com.momentwithace.cleanquick.data.models.VerificationToken;
import com.momentwithace.cleanquick.utils.CleanQuickUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class VerificationTokenServiceImpl implements VerificationTokenService {
    @Override
    public VerificationToken generateVerificationToken(String userEmail) {
        String tokenString = CleanQuickUtils.generateToken();
        VerificationToken verificationToken = VerificationToken.builder()
                .token(tokenString)
                .userEmail(userEmail)
                .createdAt(LocalDateTime.now())
                .expiresAt(LocalDateTime.now().plusMinutes(5)
                ).build();
        return verificationToken;
    }
}
