package com.momentwithace.cleanquick.repositories;

import com.momentwithace.cleanquick.data.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
