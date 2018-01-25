package com.smartcrowd.app.repository;

import gov.step.app.domain.AuditLogHistory;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the AuditLogHistory entity.
 */
public interface AuditLogHistoryRepository extends JpaRepository<AuditLogHistory,Long> {

}
