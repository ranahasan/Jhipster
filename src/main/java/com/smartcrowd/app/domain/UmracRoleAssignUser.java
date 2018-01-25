package com.smartcrowd.app.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A UmracRoleAssignUser.
 */
@Entity
@Table(name = "umrac_role_assign_user")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "umracroleassignuser")
public class UmracRoleAssignUser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

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
    @JoinColumn(name="user_id_id")
    private UmracIdentitySetup userId;

    @ManyToOne
    @JoinColumn(name="proc_user_id")
    private User procUserId;

    @ManyToOne
    @JoinColumn(name="role_id_id")
    private UmracRoleSetup roleId;

    @Column(name = "roles")
    private String roles;

    @Column(name = "assign_types")
    private String assignTypes;

    @Column(name = "assign_track_id")
    private String assignTrackId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public UmracIdentitySetup getUserId() {
        return userId;
    }

    public void setUserId(UmracIdentitySetup UmracIdentitySetup) {
        this.userId = UmracIdentitySetup;
    }

    public UmracRoleSetup getRoleId() {
        return roleId;
    }

    public void setRoleId(UmracRoleSetup UmracRoleSetup) {
        this.roleId = UmracRoleSetup;
    }

    public User getProcUserId() {
        return procUserId;
    }

    public void setProcUserId(User procUserId) {
        this.procUserId = procUserId;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getAssignTypes() {
        return assignTypes;
    }

    public void setAssignTypes(String assignTypes) {
        this.assignTypes = assignTypes;
    }

    public String getAssignTrackId() {
        return assignTrackId;
    }

    public void setAssignTrackId(String assignTrackId) {
        this.assignTrackId = assignTrackId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        UmracRoleAssignUser umracRoleAssignUser = (UmracRoleAssignUser) o;

        if ( ! Objects.equals(id, umracRoleAssignUser.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "UmracRoleAssignUser{" +
            "id=" + id +
            ", description='" + description + "'" +
            ", status='" + status + "'" +
            ", createDate='" + createDate + "'" +
            ", createBy='" + createBy + "'" +
            ", updatedBy='" + updatedBy + "'" +
            ", updatedTime='" + updatedTime + "'" +
            '}';
    }
}
