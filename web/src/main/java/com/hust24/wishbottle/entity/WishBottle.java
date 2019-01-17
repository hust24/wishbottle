package com.hust24.wishbottle.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class WishBottle {

    /**
     * 心愿瓶id 作为主键
     */
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 该心愿瓶的作者id 不能为空
     */
    @Column @NotNull
    private  Integer writerId;

    /**
     * 该心愿瓶的发布时间 不能为空
     */
    @Column @NotNull
    private long wishTime;

    /**
     * 该心愿的类型 0-文本 1-语音
     */
    @Column @NotNull
    private int type;

    /**
     * 捡瓶子人的id
     */
    @Column
    private Integer pickerId;

    /**
     * 瓶子的状态 0-没被捞 1-被捞取 2捞取者删除 3-发布者删除 4-两者都删 5-管理员删除
     */
    @Column @NotNull
    private Integer status = 0;

    /**
     * 树洞内容
     */
    @Column @NotNull
    private String content;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWriterId() {
        return writerId;
    }

    public void setWriterId(Integer writerId) {
        this.writerId = writerId;
    }

    public long getWishTime() {
        return wishTime;
    }

    public void setWishTime(long wishTime) {
        this.wishTime = wishTime;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Integer getPickerId() {
        return pickerId;
    }

    public void setPickerId(Integer pickerId) {
        this.pickerId = pickerId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
