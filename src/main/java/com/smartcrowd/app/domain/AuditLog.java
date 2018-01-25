package com.smartcrowd.app.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import java.time.LocalDate;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A AuditLog.
 */
@Entity
@Table(name = "audit_log")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "auditlog")
public class AuditLog implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "event_time")
    private LocalDate eventTime;

    @Column(name = "event")
    private String event;

    @Column(name = "event_type")
    private String eventType;

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

    @Column(name = "user_ip_address")
    private String userIpAddress;

    @Column(name = "user_mac_address")
    private String userMacAddress;

    @Column(name = "device_name")
    private String deviceName;

    @Column(name = "status_action")
    private String statusAction;

    @Column(name = "types")
    private String types;

    @Column(name = "user_browser")
    private String userBrowser;

    @Column(name = "user_name")
    private String userName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getEventTime() {
        return eventTime;
    }

    public void setEventTime(LocalDate eventTime) {
        this.eventTime = eventTime;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
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

    public String getUserIpAddress() {
        return userIpAddress;
    }

    public void setUserIpAddress(String userIpAddress) {
        this.userIpAddress = userIpAddress;
    }

    public String getUserMacAddress() {
        return userMacAddress;
    }

    public void setUserMacAddress(String userMacAddress) {
        this.userMacAddress = userMacAddress;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getStatusAction() {
        return statusAction;
    }

    public void setStatusAction(String statusAction) {
        this.statusAction = statusAction;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getUserBrowser() {
        return userBrowser;
    }

    public void setUserBrowser(String userBrowser) {
        this.userBrowser = userBrowser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AuditLog auditLog = (AuditLog) o;

        if ( ! Objects.equals(id, auditLog.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "AuditLog{" +
            "id=" + id +
            ", eventTime='" + eventTime + "'" +
            ", event='" + event + "'" +
            ", eventType='" + eventType + "'" +
            ", status='" + status + "'" +
            ", createBy='" + createBy + "'" +
            ", createDate='" + createDate + "'" +
            ", updateBy='" + updateBy + "'" +
            ", updateDate='" + updateDate + "'" +
            ", remarks='" + remarks + "'" +
            ", userId='" + userId + "'" +
            ", userIpAddress='" + userIpAddress + "'" +
            ", userMacAddress='" + userMacAddress + "'" +
            ", deviceName='" + deviceName + "'" +
            ", statusAction='" + statusAction + "'" +
            ", types='" + types + "'" +
            ", userBrowser='" + userBrowser + "'" +
            '}';
    }
}
