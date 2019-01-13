package com.hust24.wishbottle.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
public class WishReply {

    /**
     * 回复id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 相关心愿id
     */
    @Column
    @NotNull
    private Integer wishBottleId;

    /**
     * 写这条回复的作者id
     */
    @Column @NotNull
    private Integer replyerId;

    /**
     * 回复的发表时间
     */
    @Column @NotNull
    private Date time;

    /**
     * 回复的内容 默认为空字符 不能为null
     */
    @Column @NotNull
    private String content = "";

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWishBottleId() {
        return wishBottleId;
    }

    public void setWishBottleId(Integer wishBottleId) {
        this.wishBottleId = wishBottleId;
    }

    public Integer getReplyerId() {
        return replyerId;
    }

    public void setReplyerId(Integer replyerId) {
        this.replyerId = replyerId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
