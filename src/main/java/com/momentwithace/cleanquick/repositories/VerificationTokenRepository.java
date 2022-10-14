package com.momentwithace.cleanquick.repositories;

import com.momentwithace.cleanquick.data.models.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
    Optional<VerificationToken> findByUserEmail(String userEmail);
    Optional<VerificationToken> findByToken(String token);
}
