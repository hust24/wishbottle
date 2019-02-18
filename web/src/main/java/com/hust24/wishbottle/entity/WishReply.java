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
    private long wishReplyTime;

    /**
     * 回复的内容 默认为空字符 不能为null
     */
    @Column @NotNull
    private String content = "";

    /**
     * 回复的消息类型 0文本 1语音
     */
    @Column @NotNull
    private int type;

    /**
     * 构造方法
     * @param wishbottleid 心愿瓶id
     * @param content 回复内容
     * @param type 回复类型
     * @param replyerid 回复者id
     * @param time 回复时间
     */
    public WishReply(Integer wishbottleid, String content, int type, Integer replyerid, long time){
        this.wishBottleId = wishbottleid;
        this.content = content;
        this.type = type;
        this.replyerId = replyerid;
        this.wishReplyTime = time;
    }


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

    public long getWishReplyTime() {
        return wishReplyTime;
    }

    public void setWishReplyTime(long wishReplyTime) {
        this.wishReplyTime = wishReplyTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
