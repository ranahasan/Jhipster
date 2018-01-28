package com.smartcrowd.app.repository.search;

import com.smartcrowd.app.domain.UmracRoleAssignUser;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data ElasticSearch repository for the UmracRoleAssignUser entity.
 */
public interface UmracRoleAssignUserSearchRepository extends ElasticsearchRepository<UmracRoleAssignUser, Long> {
}
