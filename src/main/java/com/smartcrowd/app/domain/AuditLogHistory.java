package com.smartcrowd.app.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import java.time.LocalDate;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A AuditLogHistory.
 */
@Entity
@Table(name = "audit_log_history")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "auditloghistory")
public class AuditLogHistory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "col_name")
    private String colName;

    @Column(name = "value_before")
    private String valueBefore;

    @Column(name = "value_after")
    private String valueAfter;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "create_by")
    private Long createBy;

    @Column(name = "create_date")
    private LocalDate createDate;

    @Column(name = "update_by")
    private Long updateBy;

    @Column(name = "update_date")
    private LocalDate updateDate;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "entity_name")
    private String entityName;

    @ManyToOne
    private AuditLog eventId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }

    public String getValueBefore() {
        return valueBefore;
    }

    public void setValueBefore(String valueBefore) {
        this.valueBefore = valueBefore;
    }

    public String getValueAfter() {
        return valueAfter;
    }

    public void setValueAfter(String valueAfter) {
        this.valueAfter = valueAfter;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public AuditLog getEventId() {
        return eventId;
    }

    public void setEventId(AuditLog AuditLog) {
        this.eventId = AuditLog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AuditLogHistory auditLogHistory = (AuditLogHistory) o;

        if ( ! Objects.equals(id, auditLogHistory.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "AuditLogHistory{" +
            "id=" + id +
            ", colName='" + colName + "'" +
            ", valueBefore='" + valueBefore + "'" +
            ", valueAfter='" + valueAfter + "'" +
            ", status='" + status + "'" +
            ", createBy='" + createBy + "'" +
            ", createDate='" + createDate + "'" +
            ", updateBy='" + updateBy + "'" +
            ", updateDate='" + updateDate + "'" +
            ", remarks='" + remarks + "'" +
            ", userId='" + userId + "'" +
            ", entityName='" + entityName + "'" +
            '}';
    }
}
