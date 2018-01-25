package com.smartcrowd.app.repository.search;

import com.smartcrowd.app.domain.InvestorTypes;
import com.smartcrowd.app.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface InvestorTypesSearchRepository extends ElasticsearchRepository<InvestorTypes, Long> {
}
