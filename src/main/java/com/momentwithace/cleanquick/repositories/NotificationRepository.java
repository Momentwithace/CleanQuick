package com.momentwithace.cleanquick.repositories;

import com.momentwithace.cleanquick.data.models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
