package com.smartcrowd.app.repository.search;

import com.smartcrowd.app.domain.UmracRightsSetup;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data ElasticSearch repository for the UmracRightsSetup entity.
 */
public interface UmracRightsSetupSearchRepository extends ElasticsearchRepository<UmracRightsSetup, Long> {
}
