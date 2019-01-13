package com.hust24.wishbottle.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class User {

    /**
     * 用户id 作为主键
     */
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户昵称 不能为空 有一个默认值
     */
    @Column  @NotNull
    private String name = "DEFAULT_NAME";

    /**
     * 用户头像
     */
    @Column
    private String avatar;

    /**
     * 用户性别 0-男 1-女 不能为空 默认值为0
     */
    @Column @NotNull
    private int gender = 0;

    /**
     * 用户年龄 因为有统计年龄的功能模块 所以这个字段不能为空 默认为18
     *
     */
    @Column @NotNull
    private int age = 18;

    /**
     * 用户个性签名 默认为空字符
     */
    @Column
    private String signature = "";


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
