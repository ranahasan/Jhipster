package com.smartcrowd.app.repository;

import com.smartcrowd.app.domain.InvestorRegistration;
import com.smartcrowd.app.domain.InvestorTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the InvestorRegistration entity.
 */
@Repository
public interface InvestorRegistrationRepository extends JpaRepository<InvestorRegistration, Long> {

    List<InvestorRegistration> {}
    @Opti

}
