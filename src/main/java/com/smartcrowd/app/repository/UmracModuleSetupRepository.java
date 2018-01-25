package com.smartcrowd.app.repository;

import gov.step.app.domain.UmracModuleSetup;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data JPA repository for the UmracModuleSetup entity.
 */
public interface UmracModuleSetupRepository extends JpaRepository<UmracModuleSetup,Long> {

    @Query("select umracModuleSetup from UmracModuleSetup umracModuleSetup where umracModuleSetup.moduleName = :moduleName")
    Optional<UmracModuleSetup> findOneByModuleName(@Param("moduleName") String moduleName);

    @Query("select umracModuleSetup from UmracModuleSetup umracModuleSetup where umracModuleSetup.status = :status")
    UmracModuleSetup findAllModule(@Param("status") Boolean status);

    @Query("select umracSubmoduleSetup from UmracSubmoduleSetup umracSubmoduleSetup where umracSubmoduleSetup.status = :status order by umracSubmoduleSetup.id ASC")
    Page<UmracModuleSetup> findAllUmracModuleSetupByOrderID(Pageable pageable, @Param("status") Boolean status);

    Page<UmracModuleSetup> findByStatus(Boolean status, Pageable pageable);
    List<UmracModuleSetup> findByStatus(Boolean status);
}
