package com.momentwithace.cleanquick.repositories;

import com.momentwithace.cleanquick.data.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
