package com.smartcrowd.app.web.rest.util;

/**
 * Created by leads on 2/16/16.
 */
public class Emails {

    private String to;
    private String cc;
    private String subject;
    private String emailBody;
    private String track_id;
    private String api_key;
    private String email_type;
    private String send_from_ip;
    private Long logged_user_id;


    public Emails() {
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEmailBody() {
        return emailBody;
    }

    public void setEmailBody(String emailBody) {
        this.emailBody = emailBody;
    }

    public String getTrack_id() {
        return track_id;
    }

    public void setTrack_id(String track_id) {
        this.track_id = track_id;
    }

    public String getApi_key() {
        return api_key;
    }

    public void setApi_key(String api_key) {
        this.api_key = api_key;
    }

    public String getEmail_type() {
        return email_type;
    }

    public void setEmail_type(String email_type) {
        this.email_type = email_type;
    }

    public String getSend_from_ip() {
        return send_from_ip;
    }

    public void setSend_from_ip(String send_from_ip) {
        this.send_from_ip = send_from_ip;
    }

    public Long getLogged_user_id() {
        return logged_user_id;
    }

    public void setLogged_user_id(Long logged_user_id) {
        this.logged_user_id = logged_user_id;
    }
}
