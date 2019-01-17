package com.hust24.wishbottle.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Message {

    /**
     * 消息id  主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;



    /**
     * 消息内容
     */
    @Column
    @NotNull
    private String content;



    /**
     * 是否已读，0 未读，1已读
     */
    @Column
    @NotNull
    private boolean flag;


    /**
     * 消息目标用户id
     */
    @Column
    @NotNull
    private  Integer targetId;



    /**
     * 消息类型 1-系统消息 2-心愿瓶回复 3-树洞回复
     */
    @Column
    @NotNull
    private Integer type;

    /**
     * 心愿瓶回复或者树洞回复id
     */
    @Column
    @NotNull

    private Integer sourceId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }
}