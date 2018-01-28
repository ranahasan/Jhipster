package com.smartcrowd.app.repository.search;

import com.smartcrowd.app.domain.UmracActionSetup;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data ElasticSearch repository for the UmracActionSetup entity.
 */
public interface UmracActionSetupSearchRepository extends ElasticsearchRepository<UmracActionSetup, Long> {
}
