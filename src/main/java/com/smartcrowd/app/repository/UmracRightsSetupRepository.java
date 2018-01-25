package com.smartcrowd.app.repository;

import gov.step.app.domain.UmracRightsSetup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Spring Data JPA repository for the UmracRightsSetup entity.
 */
public interface UmracRightsSetupRepository extends JpaRepository<UmracRightsSetup,Long> {

    /*@Query("select umracRightsSetup from UmracRightsSetup umracRightsSetup where umracRightsSetup.roleId = :roleId AND umracRightsSetup.module_id = :moduleId")
    Optional<UmracRightsSetup> findOneByRoleIdAndModuleId(@Param("roleId") Long roleId,@Param("moduleId") Long moduleId);*/
    @Query("select umracRightsSetup from UmracRightsSetup umracRightsSetup where umracRightsSetup.roleId = :roleId AND umracRightsSetup.module_id = :moduleId")
    List<UmracRightsSetup> findOneByRoleIdAndModuleId(@Param("roleId") Long roleId, @Param("moduleId") Long moduleId);
    @Query("select umracRightsSetup from UmracRightsSetup umracRightsSetup where umracRightsSetup.roleId = :roleId AND umracRightsSetup.module_id = :moduleId AND umracRightsSetup.subModule_id = :subModuleId")
    List<UmracRightsSetup> findOneByRoleIdAndSubModuleId(@Param("roleId") Long roleId, @Param("moduleId") Long moduleId, @Param("subModuleId") Long subModuleId);
    @Query("select umracRightsSetup from UmracRightsSetup umracRightsSetup where umracRightsSetup.roleId = :roleId AND umracRightsSetup.module_id = :moduleId AND umracRightsSetup.subModule_id = :subModuleId AND umracRightsSetup.rights = :actionId")
    List<UmracRightsSetup> findOneByRoleIdAndActionsId(@Param("roleId") Long roleId, @Param("moduleId") Long moduleId, @Param("subModuleId") Long subModuleId, @Param("actionId") String actionId);

    @Query("select umracRightsSetup from UmracRightsSetup umracRightsSetup where umracRightsSetup.roleId = :roleId")
    List<UmracRightsSetup> findByRoleId(@Param("roleId") Long roleId);
}
