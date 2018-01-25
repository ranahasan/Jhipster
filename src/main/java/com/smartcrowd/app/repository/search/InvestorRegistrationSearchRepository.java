package com.smartcrowd.app.repository.search;

import com.smartcrowd.app.domain.InvestorRegistration;
import com.smartcrowd.app.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface InvestorRegistrationSearchRepository extends ElasticsearchRepository<InvestorRegistration, Long> {
}
