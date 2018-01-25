package com.smartcrowd.app.repository.search;

import gov.step.app.domain.UmracRightsLog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data ElasticSearch repository for the UmracRightsLog entity.
 */
public interface UmracRightsLogSearchRepository extends ElasticsearchRepository<UmracRightsLog, Long> {
}
