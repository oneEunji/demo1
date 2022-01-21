package com.example.user.vo;

import org.springframework.stereotype.Component;

@Component("userAccount")
public class UserAccount
{
    private String idToken;
    private String emailId;
    private String userPw; //password
    private String userName;  //name
    private String androidId; //android_Id

    public UserAccount() {}

    public UserAccount(String idToken, String emailId,  String userName, String userPw) {
        this.idToken = idToken;
        this.emailId = emailId;
        this.userName = userName;
        this.userPw = userPw;

    }

    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAndroidId() {
        return androidId;
    }

    public void setAndroidId(String androidId) {
        this.androidId = androidId;
    }


}
//    private String work_start;//workStart
//    private String work_end; //workEnd
//    private String time_work_start;//
//    private String time_work_end;//