package com.hust24.wishbottle.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
public class TreeHole {

    /**
     * 树洞id
     */
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 该树洞的作者id
     */
    @Column @NotNull
    private Integer writerId;

    /**
     * 该树洞的发表时间
     */
    @Column @NotNull
    private Date time;

    /**
     * 树洞的文本内容
     */
    private String content;

    /**
     *
     */
    private Integer scan;

    private Integer replyNum;

    /**
     * 树洞的图片内容
     */
    private String pic;


}
