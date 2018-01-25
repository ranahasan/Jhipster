package com.smartcrowd.app.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A investor_registration.
 */
@Entity
@Table(name = "investor_registration")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "investorregistration")
public class InvestorRegistration extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "phone_no", length = 19)
    private String phone_no;

    @Column(name = "nationality", length = 30)
    private String nationality;

    @Column(name = "password", length = 20)
    private String password;

    @Column(name = "is_agree")
    private Boolean isAgree;

    @Column(name = "is_social_media")
    private Boolean isSocialMedia;

    @Column(name = "provider_id")
    private Integer providerId;

    @Column(name = "provider_user_id")
    private Integer providerUserId;

    @Column(name = "access_token", length = 128)
    private String access_token;

    @Column(name = "secreat", length = 128)
    private String secreat;

    @Column(name = "user_name", length = 45)
    private String userName;

    @Column(name = "project_url", length = 45)
    private String projectUrl;

    @JoinColumn(name = "investor_type_id")
    @ManyToOne
    private InvestorTypes investor_type_id;

    @Column(name = "is_acknowlgement")
    private Boolean isAcknowlgement;

    @Column(name = "is_pass_suitibility_test")
    private Boolean isPassSuitibilityTest;

    @Column(name = "is_locked")
    private Boolean isLocked;

    @Column(name = "number_of_attempt")
    private Integer numberOfAttempt;

    @Column(name = "suitibility_time_stamp")
    private LocalDateTime suitibilityTimeStamp;

    @Column(name = "is_self_protrait")
    private Boolean isSelfProtrait;

    @Column(name = "self_protrait_accureccy")
    private Integer selfProtraitAccureccy;

    @Column(name = "passport_number", length = 20)
    private String passportNumber;

    @Column(name = "is_valid_passport")
    private Boolean isValidPassport;

    @Column(name = "n_id", length = 20)
    private String nId;

    @Column(name = "is_valid_n_id")
    private Boolean isValidnId;

    @Column(name = "is_aml_kyc_pass")
    private Boolean isAmlKycPass;

    @Column(name = "is_valid_selfie_passport")
    private Boolean isValidSelfiePassport;

    @Column(name = "accuracy_aml_kyc")
    private Integer accuracyAmlKyc;

    @Column(name = "reg_no", length = 45)
    private String regNo;

    @Column(name = "approve_status", length = 45)
    private String approveStatus;

    @Column(name = "is_decleared")
    private Boolean isDecleared;

    @Column(name = "is_other_origin_of_funds")
    private Boolean is_other_origin_of_funds;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getAgree() {
        return isAgree;
    }

    public void setAgree(Boolean agree) {
        isAgree = agree;
    }

    public Boolean getSocialMedia() {
        return isSocialMedia;
    }

    public void setSocialMedia(Boolean socialMedia) {
        isSocialMedia = socialMedia;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public Integer getProviderUserId() {
        return providerUserId;
    }

    public void setProviderUserId(Integer providerUserId) {
        this.providerUserId = providerUserId;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getSecreat() {
        return secreat;
    }

    public void setSecreat(String secreat) {
        this.secreat = secreat;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProjectUrl() {
        return projectUrl;
    }

    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
    }

    public InvestorTypes getInvestor_type_id() {
        return investor_type_id;
    }

    public void setInvestor_type_id(InvestorTypes investor_type_id) {
        this.investor_type_id = investor_type_id;
    }

    public Boolean getAcknowlgement() {
        return isAcknowlgement;
    }

    public void setAcknowlgement(Boolean acknowlgement) {
        isAcknowlgement = acknowlgement;
    }

    public Boolean getPassSuitibilityTest() {
        return isPassSuitibilityTest;
    }

    public void setPassSuitibilityTest(Boolean passSuitibilityTest) {
        isPassSuitibilityTest = passSuitibilityTest;
    }

    public Boolean getLocked() {
        return isLocked;
    }

    public void setLocked(Boolean locked) {
        isLocked = locked;
    }

    public Integer getNumberOfAttempt() {
        return numberOfAttempt;
    }

    public void setNumberOfAttempt(Integer numberOfAttempt) {
        this.numberOfAttempt = numberOfAttempt;
    }

    public LocalDateTime getSuitibilityTimeStamp() {
        return suitibilityTimeStamp;
    }

    public void setSuitibilityTimeStamp(LocalDateTime suitibilityTimeStamp) {
        this.suitibilityTimeStamp = suitibilityTimeStamp;
    }

    public Boolean getSelfProtrait() {
        return isSelfProtrait;
    }

    public void setSelfProtrait(Boolean selfProtrait) {
        isSelfProtrait = selfProtrait;
    }

    public Integer getSelfProtraitAccureccy() {
        return selfProtraitAccureccy;
    }

    public void setSelfProtraitAccureccy(Integer selfProtraitAccureccy) {
        this.selfProtraitAccureccy = selfProtraitAccureccy;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Boolean getValidPassport() {
        return isValidPassport;
    }

    public void setValidPassport(Boolean validPassport) {
        isValidPassport = validPassport;
    }

    public String getnId() {
        return nId;
    }

    public void setnId(String nId) {
        this.nId = nId;
    }

    public Boolean getValidnId() {
        return isValidnId;
    }

    public void setValidnId(Boolean validnId) {
        isValidnId = validnId;
    }

    public Boolean getAmlKycPass() {
        return isAmlKycPass;
    }

    public void setAmlKycPass(Boolean amlKycPass) {
        isAmlKycPass = amlKycPass;
    }

    public Boolean getValidSelfiePassport() {
        return isValidSelfiePassport;
    }

    public void setValidSelfiePassport(Boolean validSelfiePassport) {
        isValidSelfiePassport = validSelfiePassport;
    }

    public Integer getAccuracyAmlKyc() {
        return accuracyAmlKyc;
    }

    public void setAccuracyAmlKyc(Integer accuracyAmlKyc) {
        this.accuracyAmlKyc = accuracyAmlKyc;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

    public Boolean getDecleared() {
        return isDecleared;
    }

    public void setDecleared(Boolean decleared) {
        isDecleared = decleared;
    }

    public Boolean getIs_other_origin_of_funds() {
        return is_other_origin_of_funds;
    }

    public void setIs_other_origin_of_funds(Boolean is_other_origin_of_funds) {
        this.is_other_origin_of_funds = is_other_origin_of_funds;
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
        InvestorRegistration that = (InvestorRegistration) object;
        return java.util.Objects.equals(id, that.id);
    }

    public int hashCode() {

        return java.util.Objects.hash(super.hashCode(), id);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "InvestorRegistration{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", phone_no='" + phone_no + '\'' +
            ", nationality='" + nationality + '\'' +
            ", password='" + password + '\'' +
            ", isAgree=" + isAgree +
            ", isSocialMedia=" + isSocialMedia +
            ", providerId=" + providerId +
            ", providerUserId=" + providerUserId +
            ", access_token='" + access_token + '\'' +
            ", secreat='" + secreat + '\'' +
            ", userName='" + userName + '\'' +
            ", projectUrl='" + projectUrl + '\'' +
            ", investor_type_id=" + investor_type_id +
            ", isAcknowlgement=" + isAcknowlgement +
            ", isPassSuitibilityTest=" + isPassSuitibilityTest +
            ", isLocked=" + isLocked +
            ", numberOfAttempt=" + numberOfAttempt +
            ", suitibilityTimeStamp=" + suitibilityTimeStamp +
            ", isSelfProtrait=" + isSelfProtrait +
            ", selfProtraitAccureccy=" + selfProtraitAccureccy +
            ", passportNumber='" + passportNumber + '\'' +
            ", isValidPassport=" + isValidPassport +
            ", nId='" + nId + '\'' +
            ", isValidnId=" + isValidnId +
            ", isAmlKycPass=" + isAmlKycPass +
            ", isValidSelfiePassport=" + isValidSelfiePassport +
            ", accuracyAmlKyc=" + accuracyAmlKyc +
            ", regNo='" + regNo + '\'' +
            ", approveStatus='" + approveStatus + '\'' +
            ", isDecleared=" + isDecleared +
            ", is_other_origin_of_funds=" + is_other_origin_of_funds +
            ", status=" + status +
            ", createBy=" + createBy +
            ", createDate=" + createDate +
            ", updateBy=" + updateBy +
            ", updateDate=" + updateDate +
            '}';
    }
}
