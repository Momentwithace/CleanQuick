package com.momentwithace.cleanquick.service;

import com.momentwithace.cleanquick.data.models.VerificationToken;

public interface VerificationTokenService {
    VerificationToken generateVerificationToken(String userEmail);
    boolean isValidVerificationToken(VerificationToken verificationToken);
}
