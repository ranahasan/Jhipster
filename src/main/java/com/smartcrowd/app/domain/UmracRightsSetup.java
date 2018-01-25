package com.smartcrowd.app.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A UmracRightsSetup.
 */
@Entity
@Table(name = "umrac_rights_setup")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "umracrightssetup")
public class UmracRightsSetup implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "right_id")
    private String rightId;

    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "module_id")
    private Long module_id;

    @Column(name = "sub_module_id")
    private Long subModule_id;

    @Column(name = "rights")
    private String rights;

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

    public String getRightId() {
        return rightId;
    }

    public void setRightId(String rightId) {
        this.rightId = rightId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getModule_id() {
        return module_id;
    }

    public void setModule_id(Long module_id) {
        this.module_id = module_id;
    }

    public Long getSubModule_id() {
        return subModule_id;
    }

    public void setSubModule_id(Long subModule_id) {
        this.subModule_id = subModule_id;
    }

    public String getRights() {
        return rights;
    }

    public void setRights(String rights) {
        this.rights = rights;
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

        UmracRightsSetup umracRightsSetup = (UmracRightsSetup) o;

        if ( ! Objects.equals(id, umracRightsSetup.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "UmracRightsSetup{" +
            "id=" + id +
            ", rightId='" + rightId + "'" +
            ", roleId='" + roleId + "'" +
            ", module_id='" + module_id + "'" +
            ", subModule_id='" + subModule_id + "'" +
            ", rights='" + rights + "'" +
            ", description='" + description + "'" +
            ", status='" + status + "'" +
            ", createDate='" + createDate + "'" +
            ", createBy='" + createBy + "'" +
            ", updatedBy='" + updatedBy + "'" +
            ", updatedTime='" + updatedTime + "'" +
            '}';
    }
}
