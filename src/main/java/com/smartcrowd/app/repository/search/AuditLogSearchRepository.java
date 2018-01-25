package com.smartcrowd.app.repository.search;

import gov.step.app.domain.AuditLog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data ElasticSearch repository for the AuditLog entity.
 */
public interface AuditLogSearchRepository extends ElasticsearchRepository<AuditLog, Long> {
}
