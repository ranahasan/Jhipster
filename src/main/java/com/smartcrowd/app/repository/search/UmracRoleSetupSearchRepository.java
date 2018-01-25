package com.smartcrowd.app.repository.search;

import gov.step.app.domain.UmracRoleSetup;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data ElasticSearch repository for the UmracRoleSetup entity.
 */
public interface UmracRoleSetupSearchRepository extends ElasticsearchRepository<UmracRoleSetup, Long> {
}
