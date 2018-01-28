package com.smartcrowd.app.repository;

import com.smartcrowd.app.domain.UmracModuleSetup;
import com.smartcrowd.app.domain.UmracSubmoduleSetup;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data JPA repository for the UmracSubmoduleSetup entity.
 */
public interface UmracSubmoduleSetupRepository extends JpaRepository<UmracSubmoduleSetup,Long> {
    /*@Query("select umracSubmoduleSetup from UmracSubmoduleSetup umracSubmoduleSetup where umracSubmoduleSetup.moduleId = :moduleId")
    Optional<UmracSubmoduleSetup> findOneByModuleId(@Param("moduleId") Long moduleId);

    @Query("select umracSubmoduleSetup from UmracSubmoduleSetup umracSubmoduleSetup where umracSubmoduleSetup.moduleId = :moduleId order by umracSubmoduleSetup.id")
    List<UmracSubmoduleSetup> findByModuleId(@Param("moduleId") UmracModuleSetup moduleId);*/

    @Query("select umracSubmoduleSetup from UmracSubmoduleSetup umracSubmoduleSetup where umracSubmoduleSetup.moduleId = :moduleId")
    Optional<UmracSubmoduleSetup> findOneByModuleId(@Param("moduleId") Long moduleId);

    @Query("select umracSubmoduleSetup from UmracSubmoduleSetup umracSubmoduleSetup where umracSubmoduleSetup.moduleId = :moduleId order by umracSubmoduleSetup.id")
    List<UmracSubmoduleSetup> findByModuleId(@Param("moduleId") UmracModuleSetup moduleId);


    @Query("select umracSubmoduleSetup from UmracSubmoduleSetup umracSubmoduleSetup where umracSubmoduleSetup.subModuleName = :subModuleName")
    Optional<UmracSubmoduleSetup> findOneBySubModuleName(@Param("subModuleName") String subModuleName);

    @Query("select umracSubmoduleSetup from UmracSubmoduleSetup umracSubmoduleSetup where umracSubmoduleSetup.status = :status")
    UmracSubmoduleSetup findAllSubModule(@Param("status") Boolean status);

    @Query("select umracSubmoduleSetup from UmracSubmoduleSetup umracSubmoduleSetup where umracSubmoduleSetup.status = :status order by umracSubmoduleSetup.id ASC")
    Page<UmracSubmoduleSetup> findAllUmracSubmoduleSetupByOrderID(Pageable pageable, @Param("status") Boolean status);

    Page<UmracSubmoduleSetup> findByStatus(Boolean status, Pageable pageable);
}
