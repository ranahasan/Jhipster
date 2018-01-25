package com.smartcrowd.app.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.smartcrowd.app.config.Constants;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.validator.constraints.Email;
import org.joda.time.LocalDate;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

/**
 * A investor_types.
 */
@Entity
@Table(name = "investor_types")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "investortypes")
public class InvestorTypes extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type_name", length = 45)
    private String typeName;

    @Column(name = "defination", length = 45)
    private String defination;

    @Column(name = "restrictions", length = 128)
    private String restrictions;

    @Column(name = "requirments", length = 128)
    private String requirments;

    @Column(name = "risk_profile_acknowledgement", length = 45)
    private String risk_profile_acknowledgement;

    @Column(name = "decleartion", length = 512)
    private String decleartion;

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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getDefination() {
        return defination;
    }

    public void setDefination(String defination) {
        this.defination = defination;
    }

    public String getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }

    public String getRequirments() {
        return requirments;
    }

    public void setRequirments(String requirments) {
        this.requirments = requirments;
    }

    public String getRisk_profile_acknowledgement() {
        return risk_profile_acknowledgement;
    }

    public void setRisk_profile_acknowledgement(String risk_profile_acknowledgement) {
        this.risk_profile_acknowledgement = risk_profile_acknowledgement;
    }

    public String getDecleartion() {
        return decleartion;
    }

    public void setDecleartion(String decleartion) {
        this.decleartion = decleartion;
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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        InvestorTypes that = (InvestorTypes) object;
        return java.util.Objects.equals(id, that.id);
    }

    public int hashCode() {

        return java.util.Objects.hash(super.hashCode(), id);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "InvestorTypes{" +
            "id=" + id +
            ", typeName='" + typeName + '\'' +
            ", defination='" + defination + '\'' +
            ", restrictions='" + restrictions + '\'' +
            ", requirments='" + requirments + '\'' +
            ", risk_profile_acknowledgement='" + risk_profile_acknowledgement + '\'' +
            ", decleartion='" + decleartion + '\'' +
            ", status=" + status +
            ", createBy=" + createBy +
            ", createDate=" + createDate +
            ", updateBy=" + updateBy +
            ", updateDate=" + updateDate +
            '}';
    }
}
