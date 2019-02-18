package com.hust24.wishbottle.repository;

import com.hust24.wishbottle.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message,Integer> {
    @Query(value ="select count(*) from message where target_id=?1 and type=?2 and flag=false ",nativeQuery = true)
    Integer nonReadMessageNumber(Integer targetId,Integer type);
    @Query(value="select * from  message where target_id=?1 and  type=?2 ",nativeQuery =true)
    List<Message> getMessageByType(Integer targetId,Integer type);//@query后面与数据库字段和表名一致,如target_id.
}
