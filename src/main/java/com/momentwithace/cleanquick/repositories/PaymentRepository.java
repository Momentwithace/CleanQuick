package com.momentwithace.cleanquick.repositories;

import com.momentwithace.cleanquick.data.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
