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
    private Date date;

    /**
     * 该心愿的类型 0-文本 1-语音
     */
    @Column @NotNull
    private int type = 0;

    /**
     * 捡瓶子人的id  默认值为-1
     */
    @Column
    private Integer pickerId = -1;
}
