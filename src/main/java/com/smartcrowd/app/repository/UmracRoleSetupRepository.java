package com.smartcrowd.app.repository;

import gov.step.app.domain.UmracRoleSetup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * Spring Data JPA repository for the UmracRoleSetup entity.
 */
public interface UmracRoleSetupRepository extends JpaRepository<UmracRoleSetup,Long> {

    @Query("select umracRoleSetup from UmracRoleSetup umracRoleSetup where umracRoleSetup.roleName = :roleName")
    Optional<UmracRoleSetup> findOneByRoleName(@Param("roleName") String roleName);

}
