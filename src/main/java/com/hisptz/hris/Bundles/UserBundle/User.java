package com.hisptz.hris.Bundles.UserBundle;

/**
 * Created by Guest on 8/7/18.
 */
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "users")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    private Integer organisationunitId;
//    private String username;
//    private String usernameCanonical;
//    private String email;
//    private String emailCanonical;
//    private boolean enabled;
//    private String salt;
//    private String password;
//    private Timestamp lastLogin;
//    private boolean locked;
//    private boolean expired;
//    private Timestamp expiresAt;
//    private String confirmationToken;
//    private Timestamp passwordRequestedAt;
//    private String roles;
//    private boolean credentialsExpired;
//    private Timestamp credentialsExpireAt;
//    private String uid;
//    private String phonenumber;
//    private String jobtitle;
//    private String firstname;
//    private String middlename;
//    private String surname;
//    private Timestamp datecreated;
//    private Timestamp lastupdated;
//    private Timestamp deletedat;
//    private String description;

    @Basic
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    @Basic
//    @Column(name = "organisationunit_id")
//    public Integer getOrganisationunitId() {
//        return organisationunitId;
//    }
//
//    public void setOrganisationunitId(Integer organisationunitId) {
//        this.organisationunitId = organisationunitId;
//    }
//
//    @Basic
//    @Column(name = "username")
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    @Basic
//    @Column(name = "username_canonical")
//    public String getUsernameCanonical() {
//        return usernameCanonical;
//    }
//
//    public void setUsernameCanonical(String usernameCanonical) {
//        this.usernameCanonical = usernameCanonical;
//    }
//
//    @Basic
//    @Column(name = "email")
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    @Basic
//    @Column(name = "email_canonical")
//    public String getEmailCanonical() {
//        return emailCanonical;
//    }
//
//    public void setEmailCanonical(String emailCanonical) {
//        this.emailCanonical = emailCanonical;
//    }
//
//    @Basic
//    @Column(name = "enabled")
//    public boolean isEnabled() {
//        return enabled;
//    }
//
//    public void setEnabled(boolean enabled) {
//        this.enabled = enabled;
//    }
//
//    @Basic
//    @Column(name = "salt")
//    public String getSalt() {
//        return salt;
//    }
//
//    public void setSalt(String salt) {
//        this.salt = salt;
//    }
//
//    @Basic
//    @Column(name = "password")
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    @Basic
//    @Column(name = "last_login")
//    public Timestamp getLastLogin() {
//        return lastLogin;
//    }
//
//    public void setLastLogin(Timestamp lastLogin) {
//        this.lastLogin = lastLogin;
//    }
//
//    @Basic
//    @Column(name = "locked")
//    public boolean isLocked() {
//        return locked;
//    }
//
//    public void setLocked(boolean locked) {
//        this.locked = locked;
//    }
//
//    @Basic
//    @Column(name = "expired")
//    public boolean isExpired() {
//        return expired;
//    }
//
//    public void setExpired(boolean expired) {
//        this.expired = expired;
//    }
//
//    @Basic
//    @Column(name = "expires_at")
//    public Timestamp getExpiresAt() {
//        return expiresAt;
//    }
//
//    public void setExpiresAt(Timestamp expiresAt) {
//        this.expiresAt = expiresAt;
//    }
//
//    @Basic
//    @Column(name = "confirmation_token")
//    public String getConfirmationToken() {
//        return confirmationToken;
//    }
//
//    public void setConfirmationToken(String confirmationToken) {
//        this.confirmationToken = confirmationToken;
//    }
//
//    @Basic
//    @Column(name = "password_requested_at")
//    public Timestamp getPasswordRequestedAt() {
//        return passwordRequestedAt;
//    }
//
//    public void setPasswordRequestedAt(Timestamp passwordRequestedAt) {
//        this.passwordRequestedAt = passwordRequestedAt;
//    }
//
//    @Basic
//    @Column(name = "roles")
//    public String getRoles() {
//        return roles;
//    }
//
//    public void setRoles(String roles) {
//        this.roles = roles;
//    }
//
//    @Basic
//    @Column(name = "credentials_expired")
//    public boolean isCredentialsExpired() {
//        return credentialsExpired;
//    }
//
//    public void setCredentialsExpired(boolean credentialsExpired) {
//        this.credentialsExpired = credentialsExpired;
//    }
//
//    @Basic
//    @Column(name = "credentials_expire_at")
//    public Timestamp getCredentialsExpireAt() {
//        return credentialsExpireAt;
//    }
//
//    public void setCredentialsExpireAt(Timestamp credentialsExpireAt) {
//        this.credentialsExpireAt = credentialsExpireAt;
//    }
//
//    @Basic
//    @Column(name = "uid")
//    public String getUid() {
//        return uid;
//    }
//
//    public void setUid(String uid) {
//        this.uid = uid;
//    }
//
//    @Basic
//    @Column(name = "phonenumber")
//    public String getPhonenumber() {
//        return phonenumber;
//    }
//
//    public void setPhonenumber(String phonenumber) {
//        this.phonenumber = phonenumber;
//    }
//
//    @Basic
//    @Column(name = "jobtitle")
//    public String getJobtitle() {
//        return jobtitle;
//    }
//
//    public void setJobtitle(String jobtitle) {
//        this.jobtitle = jobtitle;
//    }
//
//    @Basic
//    @Column(name = "firstname")
//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    @Basic
//    @Column(name = "middlename")
//    public String getMiddlename() {
//        return middlename;
//    }
//
//    public void setMiddlename(String middlename) {
//        this.middlename = middlename;
//    }
//
//    @Basic
//    @Column(name = "surname")
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    @Basic
//    @Column(name = "datecreated")
//    public Timestamp getDatecreated() {
//        return datecreated;
//    }
//
//    public void setDatecreated(Timestamp datecreated) {
//        this.datecreated = datecreated;
//    }
//
//    @Basic
//    @Column(name = "lastupdated")
//    public Timestamp getLastupdated() {
//        return lastupdated;
//    }
//
//    public void setLastupdated(Timestamp lastupdated) {
//        this.lastupdated = lastupdated;
//    }
//
//    @Basic
//    @Column(name = "deletedat")
//    public Timestamp getDeletedat() {
//        return deletedat;
//    }
//
//    public void setDeletedat(Timestamp deletedat) {
//        this.deletedat = deletedat;
//    }
//
//    @Basic
//    @Column(name = "description")
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User that = (User) o;
//        return id == that.id &&
//                enabled == that.enabled &&
//                locked == that.locked &&
//                expired == that.expired &&
//                credentialsExpired == that.credentialsExpired &&
//                Objects.equals(organisationunitId, that.organisationunitId) &&
//                Objects.equals(username, that.username) &&
//                Objects.equals(usernameCanonical, that.usernameCanonical) &&
//                Objects.equals(email, that.email) &&
//                Objects.equals(emailCanonical, that.emailCanonical) &&
//                Objects.equals(salt, that.salt) &&
//                Objects.equals(password, that.password) &&
//                Objects.equals(lastLogin, that.lastLogin) &&
//                Objects.equals(expiresAt, that.expiresAt) &&
//                Objects.equals(confirmationToken, that.confirmationToken) &&
//                Objects.equals(passwordRequestedAt, that.passwordRequestedAt) &&
//                Objects.equals(roles, that.roles) &&
//                Objects.equals(credentialsExpireAt, that.credentialsExpireAt) &&
//                Objects.equals(uid, that.uid) &&
//                Objects.equals(phonenumber, that.phonenumber) &&
//                Objects.equals(jobtitle, that.jobtitle) &&
//                Objects.equals(firstname, that.firstname) &&
//                Objects.equals(middlename, that.middlename) &&
//                Objects.equals(surname, that.surname) &&
//                Objects.equals(datecreated, that.datecreated) &&
//                Objects.equals(lastupdated, that.lastupdated) &&
//                Objects.equals(deletedat, that.deletedat) &&
//                Objects.equals(description, that.description);
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(id, organisationunitId, username, usernameCanonical, email, emailCanonical, enabled, salt, password, lastLogin, locked, expired, expiresAt, confirmationToken, passwordRequestedAt, roles, credentialsExpired, credentialsExpireAt, uid, phonenumber, jobtitle, firstname, middlename, surname, datecreated, lastupdated, deletedat, description);
//    }
}