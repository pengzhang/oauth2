/*
 * Copyright (c) 2013 Honyee Industry Group Co., Ltd
 * www.honyee.biz
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Honyee Industry Group Co., Ltd ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement you
 * entered into with Honyee Industry Group Co., Ltd.
 */
package cc.wdcy.domain.user;

import cc.wdcy.domain.AbstractDomain;
import cc.wdcy.domain.shared.BeanProvider;

import java.util.Date;

/**
 * @author Shengzhao Li
 */
public class User extends AbstractDomain {

    private transient UserRepository userRepository = BeanProvider.getBean(UserRepository.class);

    private String username;
    private String password;

    private String phone;
    private String email;
    //Default user is initial when create database, do not delete
    private boolean defaultUser = false;

    private Date lastLoginTime;

    public User() {
    }

    public User(String username, String password, String phone, String email) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
    }

    public boolean defaultUser() {
        return defaultUser;
    }

    public String username() {
        return username;
    }

    public String password() {
        return password;
    }

    public String phone() {
        return phone;
    }

    public String email() {
        return email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{username='").append(username).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", id='").append(id).append('\'');
        sb.append(", guid='").append(guid).append('\'');
        sb.append(", defaultUser='").append(defaultUser).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public User email(String email) {
        this.email = email;
        return this;
    }

    public User phone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public void saveOrUpdate() {
        if (isNewly()) {
            userRepository.saveUser(this);
        } else {
            userRepository.updateUser(this);
        }
    }

    public User username(String username) {
        this.username = username;
        return this;
    }



    public Date lastLoginTime() {
        return lastLoginTime;
    }

    public void lastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}