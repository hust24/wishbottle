package com.hust24.wishbottle.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Manager {
    /**
     * 管理员id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    /**
     * 管理员账号，不能为空
     */
    @Column
    @NotNull
    private String account;

    /**
     * 管理员密码，不能为空，密码(6-18位，头尾不能空格)
     */
    @Column
    @NotNull
    private  String psd;



    /**
     * 管理员类型，不能为空,0-普通管理员  1-超级管理员
     */
    @Column
    @NotNull
    private Integer type ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPsd() {
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}