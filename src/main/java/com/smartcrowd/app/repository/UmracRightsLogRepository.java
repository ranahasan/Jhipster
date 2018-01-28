package com.smartcrowd.app.repository;

import com.smartcrowd.app.domain.UmracRightsLog;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the UmracRightsLog entity.
 */
public interface UmracRightsLogRepository extends JpaRepository<UmracRightsLog,Long> {

}
