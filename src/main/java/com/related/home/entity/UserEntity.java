package com.related.home.entity;

import javax.persistence.*;

@Entity
@Table(name="user")
public class UserEntity {
    @Id
    @Column(name="pk")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long pk;
    @Column(name="nick_name")
    private String nickName;
    @Column(name="sex")
    private String sex;
    @Column(name="user_id")
    private String userId;
    @Column(name="password")
    private String password;
    @Column(name="mobile_number")
    private long mobileNumber;
    @Column(name="email")
    private String email;
    @Column(name="address_id")
    private long addressId;
    @Column(name="school_accreditation_id")
    private long schoolAccreditationId;
    @Column(name="identity_accreditation_id")
    private long identityAccreditationId;
    @Column(name="user_type")
    private int userType;
    @Column(name="status")
    private int status;

    public long getPk() {
        return pk;
    }

    public void setPk(long pk) {
        this.pk = pk;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public long getSchoolAccreditationId() {
        return schoolAccreditationId;
    }

    public void setSchoolAccreditationId(long schoolAccreditationId) {
        this.schoolAccreditationId = schoolAccreditationId;
    }

    public long getIdentityAccreditationId() {
        return identityAccreditationId;
    }

    public void setIdentityAccreditationId(long identityAccreditationId) {
        this.identityAccreditationId = identityAccreditationId;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
