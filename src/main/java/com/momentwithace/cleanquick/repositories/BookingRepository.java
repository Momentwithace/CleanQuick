package com.momentwithace.cleanquick.repositories;

import com.momentwithace.cleanquick.data.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
