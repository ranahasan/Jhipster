package com.smartcrowd.app.repository;

import gov.step.app.domain.AuditLog;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

/**
 * Spring Data JPA repository for the AuditLog entity.
 */
public interface AuditLogRepository extends JpaRepository<AuditLog,Long> {

    @Query("select auditLog from AuditLog auditLog where auditLog.id = :id")
    Page<AuditLog> findAllAudit(Pageable pageable, @Param("id") Long id);

    @Query("select auditLog from AuditLog auditLog where auditLog.status = true order by auditLog.id desc")
    Page<AuditLog> findAllAuditDesc(Pageable pageable);

}
