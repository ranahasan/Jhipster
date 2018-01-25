package com.smartcrowd.app.repository.search;

import gov.step.app.domain.UmracModuleSetup;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data ElasticSearch repository for the UmracModuleSetup entity.
 */
public interface UmracModuleSetupSearchRepository extends ElasticsearchRepository<UmracModuleSetup, Long> {
}
