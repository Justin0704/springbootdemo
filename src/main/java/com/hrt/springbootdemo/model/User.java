package com.hrt.springbootdemo.model;

import java.util.Date;

public class User {
    private Long id;
    private String username;
    private String password;
    private String nickname;

    private String sex;
    private Integer age;
    private String area;

    private String alipayAccount;
    private String weixinAccount;

    private Date registerTime;
    private String level;
    private Long integral;
    private Double balance;

    private String spreadCode;

    private Long parentId;
    private String parentNickname;

    private Date editTime;

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", area='" + area + '\'' +
                ", alipayAccount='" + alipayAccount + '\'' +
                ", weixinAccount='" + weixinAccount + '\'' +
                ", registerTime=" + registerTime +
                ", level='" + level + '\'' +
                ", integral=" + integral +
                ", balance=" + balance +
                ", spreadCode='" + spreadCode + '\'' +
                ", parentId=" + parentId +
                ", parentNickname='" + parentNickname + '\'' +
                ", isDelete='" + isDelete + '\'' +
                '}';
    }

    private String isDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAlipayAccount() {
        return alipayAccount;
    }

    public void setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount;
    }

    public String getWeixinAccount() {
        return weixinAccount;
    }

    public void setWeixinAccount(String weixinAccount) {
        this.weixinAccount = weixinAccount;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Long getIntegral() {
        return integral;
    }

    public void setIntegral(Long integral) {
        this.integral = integral;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getSpreadCode() {
        return spreadCode;
    }

    public void setSpreadCode(String spreadCode) {
        this.spreadCode = spreadCode;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getParentNickname() {
        return parentNickname;
    }

    public void setParentNickname(String parentNickname) {
        this.parentNickname = parentNickname;
    }

}
