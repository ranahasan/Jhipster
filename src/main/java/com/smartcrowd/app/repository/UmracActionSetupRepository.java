package com.smartcrowd.app.repository;

import com.smartcrowd.app.domain.UmracActionSetup;
import com.smartcrowd.app.domain.UmracSubmoduleSetup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Spring Data JPA repository for the UmracActionSetup entity.
 */
public interface UmracActionSetupRepository extends JpaRepository<UmracActionSetup,Long> {

    @Query("select umracActionSetup from UmracActionSetup umracActionSetup order by umracActionSetup.actionId")
    List<UmracActionSetup> findAllActionId();

    @Query("select umracActionSetup from UmracActionSetup umracActionSetup where umracActionSetup.submoduleId.id = :submoduleId order by umracActionSetup.id")
    List<UmracActionSetup> findBySubModuleId(@Param("submoduleId") Long submoduleId);
}
