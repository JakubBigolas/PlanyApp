package com.byd.wsg.com.wsg.byd.plan.raw;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jakub on 2016-05-22.
 */
public class RawUser {

    public String login;
    public String password;
    public String firstName;
    public String lastName;
    public String email;
    public Boolean activated;
    public String langKey;
    public List<String> authorities;
    public Long id;
    public String createdDate;
    public String lastModifiedBy;
    public String lastModifiedDate;

    @Override
    public String toString() {
        return "RawUser{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", activated=" + activated +
                ", langKey='" + langKey + '\'' +
                ", authorities=" + authorities +
                ", id=" + id +
                ", createdDate='" + createdDate + '\'' +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", lastModifiedDate='" + lastModifiedDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RawUser)) return false;

        RawUser rawUser = (RawUser) o;

        if (login != null ? !login.equals(rawUser.login) : rawUser.login != null) return false;
        if (password != null ? !password.equals(rawUser.password) : rawUser.password != null) return false;
        if (firstName != null ? !firstName.equals(rawUser.firstName) : rawUser.firstName != null) return false;
        if (lastName != null ? !lastName.equals(rawUser.lastName) : rawUser.lastName != null) return false;
        if (email != null ? !email.equals(rawUser.email) : rawUser.email != null) return false;
        if (activated != null ? !activated.equals(rawUser.activated) : rawUser.activated != null) return false;
        if (langKey != null ? !langKey.equals(rawUser.langKey) : rawUser.langKey != null) return false;
        if (authorities != null ? !authorities.equals(rawUser.authorities) : rawUser.authorities != null) return false;
        if (id != null ? !id.equals(rawUser.id) : rawUser.id != null) return false;
        if (createdDate != null ? !createdDate.equals(rawUser.createdDate) : rawUser.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(rawUser.lastModifiedBy) : rawUser.lastModifiedBy != null) return false;
        return lastModifiedDate != null ? lastModifiedDate.equals(rawUser.lastModifiedDate) : rawUser.lastModifiedDate == null;

    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (activated != null ? activated.hashCode() : 0);
        result = 31 * result + (langKey != null ? langKey.hashCode() : 0);
        result = 31 * result + (authorities != null ? authorities.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        return result;
    }

    @NonNull
    public String getLogin() {
        return login == null ? "" : login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @NonNull
    public String getPassword() {
        return password == null ? "" : password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NonNull
    public String getFirstName() {
        return firstName == null ? "" : firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @NonNull
    public String getLastName() {
        return lastName == null ? "" : lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @NonNull
    public String getEmail() {
        return email == null ? "" : email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @NonNull
    public Boolean getActivated() {
        return activated == null ? false : activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    @NonNull
    public String getLangKey() {
        return langKey;
    }

    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }

    @NonNull
    public List<String> getAuthorities() {
        return authorities  == null ? new ArrayList<String>() : authorities;
    }

    public void setAuthorities(List<String> authorities) {
        this.authorities = authorities;
    }

    @NonNull
    public Long getId() {
        return id == null ? -1 : id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NonNull
    public String getCreatedDate() {
        return createdDate == null ? "" : createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @NonNull
    public String getLastModifiedBy() {
        return lastModifiedBy == null ? "" : lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @NonNull
    public String getLastModifiedDate() {
        return lastModifiedDate == null ? "" :  lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
