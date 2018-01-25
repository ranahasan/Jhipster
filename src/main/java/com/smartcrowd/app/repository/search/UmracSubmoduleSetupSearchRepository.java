package com.smartcrowd.app.repository.search;

import gov.step.app.domain.UmracSubmoduleSetup;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data ElasticSearch repository for the UmracSubmoduleSetup entity.
 */
public interface UmracSubmoduleSetupSearchRepository extends ElasticsearchRepository<UmracSubmoduleSetup, Long> {
}
