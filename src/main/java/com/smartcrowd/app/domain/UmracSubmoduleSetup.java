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
 * A UmracSubmoduleSetup.
 */
@Entity
@Table(name = "umrac_submodule_setup")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "umracsubmodulesetup")
public class UmracSubmoduleSetup implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "sub_module_id")
    private String subModuleId;

    @NotNull
    @Column(name = "sub_module_name", nullable = false)
    private String subModuleName;

    @Column(name = "sub_module_url")
    private String subModuleUrl;

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

    @ManyToOne
    @JoinColumn(name="module_id_id")

    private UmracModuleSetup moduleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubModuleId() {
        return subModuleId;
    }

    public void setSubModuleId(String subModuleId) {
        this.subModuleId = subModuleId;
    }

    public String getSubModuleName() {
        return subModuleName;
    }

    public void setSubModuleName(String subModuleName) {
        this.subModuleName = subModuleName;
    }

    public String getSubModuleUrl() {
        return subModuleUrl;
    }

    public void setSubModuleUrl(String subModuleUrl) {
        this.subModuleUrl = subModuleUrl;
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

    public UmracModuleSetup getModuleId() {
        return moduleId;
    }

    public void setModuleId(UmracModuleSetup UmracModuleSetup) {
        this.moduleId = UmracModuleSetup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        UmracSubmoduleSetup umracSubmoduleSetup = (UmracSubmoduleSetup) o;

        if ( ! Objects.equals(id, umracSubmoduleSetup.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "UmracSubmoduleSetup{" +
            "id=" + id +
            ", subModuleId='" + subModuleId + "'" +
            ", subModuleName='" + subModuleName + "'" +
            ", subModuleUrl='" + subModuleUrl + "'" +
            ", description='" + description + "'" +
            ", status='" + status + "'" +
            ", createDate='" + createDate + "'" +
            ", createBy='" + createBy + "'" +
            ", updatedBy='" + updatedBy + "'" +
            ", updatedTime='" + updatedTime + "'" +
            '}';
    }
}
