package com.hisptz.hris.Bundles.UserBundle;

/**
 * Created by Guest on 8/7/18.
 */
import com.hisptz.hris.Bundles.FormBundle.Form;
import com.hisptz.hris.Bundles.UserGroupBundle.UserGroup;
import com.hisptz.hris.core.Model.main.Model;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "users")
public class User extends Model {

    private Integer organisationunitId;
    private String username;
    private String usernameCanonical;
    private String email;
    private String emailCanonical;
    private Boolean enabled;
    private String salt;
    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date lastLogin;
    private Boolean locked;
    private Boolean expired;

    @Temporal(TemporalType.TIMESTAMP)
    private Date expiresAt;

    private String confirmationToken;
    private Date passwordRequestedAt;
    private String roles;
    private Boolean credentialsExpired;

    @Temporal(TemporalType.TIMESTAMP)
    private Date credentialsExpireAt;

    private String phonenumber;
    private String jobtitle;
    private String firstname;
    private String middlename;
    private String surname;



    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedat;
    private String description;

    @ManyToMany(fetch = FetchType.LAZY,
                cascade = {
                        CascadeType.PERSIST,
                        CascadeType.MERGE
                }, mappedBy = "user")
    private Set<UserGroup> userGroup= new HashSet<UserGroup>();

    @ManyToMany(fetch = FetchType.LAZY,
                cascade = {
                        CascadeType.PERSIST,
                        CascadeType.MERGE
                }, mappedBy = "userId")
    private Set<Form> formId = new HashSet<Form>();
    public User() {
        super();
    }

    public User(int organisationunitId, String username, String usernameCanonical, String email, String emailCanonical, Boolean enabled, String salt, String password, Boolean locked, Boolean expired, Date expiresAt, String confirmationToken, Date passwordRequestedAt, String roles, Boolean credentialsExpired, Date credentialsExpireAt, String uid, String phonenumber, String jobtitle, String firstname, String middlename, String surname, Date deletedat, String description) {
        super();
        this.organisationunitId = organisationunitId;
        this.username = username;
        this.usernameCanonical = usernameCanonical;
        this.email = email;
        this.emailCanonical = emailCanonical;
        this.enabled = enabled;
        this.salt = salt;
        this.password = password;
        this.locked = locked;
        this.expired = expired;
        this.expiresAt = expiresAt;
        this.confirmationToken = confirmationToken;
        this.passwordRequestedAt = passwordRequestedAt;
        this.roles = roles;
        this.credentialsExpired = credentialsExpired;
        this.credentialsExpireAt = credentialsExpireAt;
        this.phonenumber = phonenumber;
        this.jobtitle = jobtitle;
        this.firstname = firstname;
        this.middlename = middlename;
        this.surname = surname;
        this.deletedat = deletedat;
        this.description = description;
    }



    @Basic
    @Column(name = "organisationunit_id")
    public int getOrganisationunitId() {
        return organisationunitId;
    }

    public void setOrganisationunitId(int organisationunitId) {
        this.organisationunitId = organisationunitId;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "username_canonical")
    public String getUsernameCanonical() {
        return usernameCanonical;
    }

    public void setUsernameCanonical(String usernameCanonical) {
        this.usernameCanonical = usernameCanonical;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "email_canonical")
    public String getEmailCanonical() {
        return emailCanonical;
    }

    public void setEmailCanonical(String emailCanonical) {
        this.emailCanonical = emailCanonical;
    }

    @Basic
    @Column(name = "enabled")
    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Basic
    @Column(name = "salt")
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "last_login")
    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Boolean isLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Boolean isExpired() {
        return expired;
    }

    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    public Date getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    public String getConfirmationToken() {
        return confirmationToken;
    }

    public void setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
    }

    public Date getPasswordRequestedAt() {
        return passwordRequestedAt;
    }

    public void setPasswordRequestedAt(Date passwordRequestedAt) {
        this.passwordRequestedAt = passwordRequestedAt;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public Boolean isCredentialsExpired() {
        return credentialsExpired;
    }

    public void setCredentialsExpired(Boolean credentialsExpired) {
        this.credentialsExpired = credentialsExpired;
    }

    public Date getCredentialsExpireAt() {
        return credentialsExpireAt;
    }

    public void setCredentialsExpireAt(Date credentialsExpireAt) {
        this.credentialsExpireAt = credentialsExpireAt;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDeletedat() {
        return deletedat;
    }

    public void setDeletedat(Date deletedat) {
        this.deletedat = deletedat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}