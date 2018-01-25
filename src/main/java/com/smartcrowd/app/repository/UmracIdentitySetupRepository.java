package com.smartcrowd.app.repository;

import gov.step.app.domain.UmracIdentitySetup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data JPA repository for the UmracIdentitySetup entity.
 */
public interface UmracIdentitySetupRepository extends JpaRepository<UmracIdentitySetup,Long> {

    List<UmracIdentitySetup> findByUserName(String name);

    @Query("select umracIdentitySetup from UmracIdentitySetup umracIdentitySetup where umracIdentitySetup.empId = :empId")
    Optional<UmracIdentitySetup> findOneByEmployeeId(@Param("empId") String empId);

    @Query("select umracIdentitySetup from UmracIdentitySetup umracIdentitySetup where umracIdentitySetup.userName = :userName")
    Optional<UmracIdentitySetup> findOneByEmployeeName(@Param("userName") String userName);

    @Query("select umracIdentitySetup from UmracIdentitySetup umracIdentitySetup where umracIdentitySetup.email = :email")
    Optional<UmracIdentitySetup> findOneByEmployeeEmail(@Param("email") String email);
}
