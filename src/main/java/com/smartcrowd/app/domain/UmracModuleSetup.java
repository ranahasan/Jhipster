package com.smartcrowd.app.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A UmracModuleSetup.
 */
@Entity
@Table(name = "umrac_module_setup")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "umracmodulesetup")
public class UmracModuleSetup implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "module_id")
    private String moduleId;

    @NotNull
    @Column(name = "module_name", nullable = false)
    private String moduleName;

    @Column(name = "module_url")
    private String moduleUrl;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "create_date")
    private LocalDate createDate;

    @Column(name = "create_by")
    private Long createBy;

    @Column(name = "update_by")
    private Long updatedBy;

    @Column(name = "update_date")
    private LocalDate updatedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleUrl() {
        return moduleUrl;
    }

    public void setModuleUrl(String moduleUrl) {
        this.moduleUrl = moduleUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDate getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDate updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        UmracModuleSetup umracModuleSetup = (UmracModuleSetup) o;

        if ( ! Objects.equals(id, umracModuleSetup.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "UmracModuleSetup{" +
            "id=" + id +
            ", moduleId='" + moduleId + "'" +
            ", moduleName='" + moduleName + "'" +
            ", moduleUrl='" + moduleUrl + "'" +
            ", description='" + description + "'" +
            ", status='" + status + "'" +
            ", createDate='" + createDate + "'" +
            ", createBy='" + createBy + "'" +
            ", updatedBy='" + updatedBy + "'" +
            ", updatedTime='" + updatedTime + "'" +
            '}';
    }
}
