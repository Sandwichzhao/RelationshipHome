package com.related.home.dto;

public class UserInfoDTO {
    private String nickName;
    private String sex;
    private String userId;
    private String passWord;
    private String phone;
    private String email;
    private String identityPicInfo;
    private String schoolPicInfo;
    private AddressDTO address;

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

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentityPicInfo() {
        return identityPicInfo;
    }

    public void setIdentityPicInfo(String identityPicInfo) {
        this.identityPicInfo = identityPicInfo;
    }

    public String getSchoolPicInfo() {
        return schoolPicInfo;
    }

    public void setSchoolPicInfo(String schoolPicInfo) {
        this.schoolPicInfo = schoolPicInfo;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }
}
