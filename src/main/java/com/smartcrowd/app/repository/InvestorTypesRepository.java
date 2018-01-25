package com.smartcrowd.app.repository;

import com.smartcrowd.app.domain.InvestorTypes;
import com.smartcrowd.app.domain.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

/**
 * Spring Data JPA repository for the InvestorTypes entity.
 */
@Repository
public interface InvestorTypesRepository extends JpaRepository<InvestorTypes, Long> {


}
