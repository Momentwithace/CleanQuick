package com.momentwithace.cleanquick.repositories;

import com.momentwithace.cleanquick.data.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
