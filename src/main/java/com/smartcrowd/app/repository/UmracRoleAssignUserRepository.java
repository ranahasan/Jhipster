package com.smartcrowd.app.repository;

import gov.step.app.domain.UmracIdentitySetup;
import gov.step.app.domain.UmracRoleAssignUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data JPA repository for the UmracRoleAssignUser entity.
 */
public interface UmracRoleAssignUserRepository extends JpaRepository<UmracRoleAssignUser,Long> {

    @Query("select umracRoleAssignUser from UmracRoleAssignUser umracRoleAssignUser where umracRoleAssignUser.userId = :userId")
    List<UmracRoleAssignUser> findOneByUserId(@Param("userId") UmracIdentitySetup userId);

    @Query("select umracRoleAssignUser from UmracRoleAssignUser umracRoleAssignUser where umracRoleAssignUser.userId = :userId")
    Optional<UmracRoleAssignUser> findOneByUser(@Param("userId") Long userId);

    @Query("select umracRoleAssignUser from UmracRoleAssignUser umracRoleAssignUser where umracRoleAssignUser.userId = :userId")
    UmracRoleAssignUser findByUserId(@Param("userId") Long userId);


}
