package com.hust24.wishbottle.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


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

  

    private long treeTime;


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


    /**
     * 树洞状态0为没删，1为删除
     * */
    private Integer status;


    /**
     * 树洞的类型 , 0树洞未删除，1树洞删除，默认值为0。
     */



   

    public long getTreeTime() {
        return treeTime;
    }

    public void setTreeTime(long treeTime) {
        this.treeTime = treeTime;
    }


    public Integer getStatus() {
        return status;
    }


    public void setStatus(Integer type) {
        this.status = type;

   
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







    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getScan() {
        return scan;
    }

    public void setScan(Integer scan) {
        this.scan = scan;
    }

    public Integer getReplyNum() {
        return replyNum;
    }

    public void setReplyNum(Integer replyNum) {
        this.replyNum = replyNum;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
