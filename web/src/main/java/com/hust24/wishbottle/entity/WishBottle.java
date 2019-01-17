package com.hust24.wishbottle.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

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
    private long date;

    /**
     * 该心愿的类型 0-文本 1-语音
     */
    @Column @NotNull
    private int type = 0;

    /**
     * 捡瓶子人的id  默认值为1
     */
    @Column
    private Integer pickerId = 1;

    /**
     * 捡瓶子人的id  默认值为1
     */
    @Column
    private String content;

    /**
     * 捡瓶子人的id  默认值为1
     */
    @Column
    private Integer status;

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

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
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
}
