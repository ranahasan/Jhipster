package com.smartcrowd.app.repository.search;

import com.smartcrowd.app.domain.AuditLogHistory;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data ElasticSearch repository for the AuditLogHistory entity.
 */
public interface AuditLogHistorySearchRepository extends ElasticsearchRepository<AuditLogHistory, Long> {
}
