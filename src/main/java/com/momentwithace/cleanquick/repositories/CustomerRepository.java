package com.momentwithace.cleanquick.repositories;

import com.momentwithace.cleanquick.data.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
