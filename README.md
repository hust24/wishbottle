一.我日

|      模块       |    功能    |  分工  | 完成情况 |
| :-------------: | :--------: | :----: | :------: |
| 微信小程序功能  |  1.5.6.7   | 单欣刚 |          |
| 微信小程序功能  | 9.10.11.12 | 李家豪 |          |
| 微信小程序功能  |  2.3.4.8   |  章琦  |          |
| 微信小程序功能  |  13.14.15  |  程睿  |          |
| 管理后台Web功能 |     5      | 单欣刚 |          |
| 管理后台Web功能 |     3      | 李家豪 |          |
| 管理后台Web功能 |     2      |  章琦  |          |
| 管理后台Web功能 |   1.4.6    |  程睿  |          |
|    后台接口     |    1-7     | 单欣刚 |          |
|    后台接口     |    8-13    | 李家豪 |          |
|    后台接口     |   14-19    |  章琦  |          |
|    后台接口     |   20-25    |  程睿  |          |





## 微信小程序功能

### 1、登录

技术要点：使用微信小程序API（或者自己写接口）判断是否是第一次登录。

数据要求：无。

功能实现：一个登录页面，以及登录功能。一个展示的主页。

### 2、写心愿

技术要点：文字模式的心愿直接调用接口；语音模式的要先调用微信API录音，然后上传语音内容得到语音保存的地址，然后调用接口。

数据要求：需要登录的用户信息。

功能实现：文字模式的页面，语音模式的页面。

### 3、捞心愿

技术要点：主要是捞瓶子的动画效果。(心愿的筛选主要在后台接口中完成)。

数据要求：需要登录的用户信息。

功能实现：捞瓶子的动画效果，展示心愿内容的页面（原型图中：捞心愿瓶显示文本、捞心愿瓶显示语音的页面）。

### 4、回复心愿

技术要点：主要是调用接口。

数据要求：用户信息，心愿信息。

功能实现：回复心愿的页面以及之后的刷新。

### 5、查看心愿列表

技术要点：主要是调用接口。

数据要求：用户信息。

功能实现：我的心愿页面，我捡到的瓶子页面。

### 6、删除心愿

技术要点：调用接口（删除动作主要在接口中完成）。由于删除心愿之前需要先删除心愿相关回复，如果回复过多，可能接口会需要一定时间，此时，要给用户一个反馈，所以微信小程序端需要有一个进度圈展示。**可以扩展，所有调用接口的动作都需要一个进度圈转动。**

数据要求：需要登录的用户信息，需要心愿数据。

功能实现：删除心愿的页面，和删除之后的页面刷新。

### 7、删除心愿回复

技术要点：调用接口就行。

数据要求：登录的用户信息，回复的数据。

功能实现：删除心愿回复的页面，刷新。

### 8、修改个人信息

技术要点：上传图片到云存储得到地址，然后调用接口保存图片地址到数据库。

数据要求：登录的用户信息。

功能实现：修改信息的页面。

### 9、写树洞

技术要点：上传图片到云存储得到地址，然后调用接口保存图片地址到数据库。

数据要求：用户信息。

功能实现：写树洞的页面，以及写完之后跳转到树洞主页的刷新动作。

### 10、查看树洞详情

技术要点：要区分是否与自己有关，从而判断是否显示删除按钮。

数据要求：用户信息，树洞信息。

功能实现：树洞详情的页面，以及删除之后的刷新。

### 11、回复树洞

技术要点：判断是评论树洞的，还是回复树洞的。

数据要求：用户信息，树洞信息。

功能实现：树洞详情的页面。

### 12、删除树洞回复

技术要点：调用接口就行。

数据要求：登录的用户信息，回复的数据。

功能实现：删除树洞回复的页面，刷新。

### 13、删除树洞

技术要点：调用接口（删除动作主要在接口中完成）。由于删除树洞之前需要先删除树洞相关回复，如果回复过多，可能接口会需要一定时间，此时，要给用户一个反馈，所以微信小程序端需要有一个进度圈展示。**可以扩展，所有调用接口的动作都需要一个进度圈转动。**

数据要求：需要登录的用户信息，需要树洞数据。

功能实现：删除树洞的页面，和删除之后的页面刷新。

### 14、查看树洞列表

技术要点：主要是调用接口。

数据要求：用户信息。

功能实现：我的树洞页面。

### 15、消息模块

技术要点：推送（目前还没想到好的方法），其他的旧主要是调用接口，然后就是未读消息的数字红点的效果。

数据要求：用户信息。

功能实现：消息模块的两个页面，参考原型图。



## 管理后台Web功能

### 1、登录

技术要点：调用接口。

数据要求：无。

功能实现：登录页面的实现，登录失败的弹框提示，以及登录成功后页面跳转。

### 2、心愿管理模块

技术要点：分页展示列表信息。

数据要求：用户信息。

功能实现：列表展示页面，以及刷新。

### 3、树洞管理模块

技术要点：分页展示列表信息，以及置顶功能的实现。

数据要求：用户信息。

功能实现：列表展示页面，以及刷新。

### 4、管理员权限

技术要点：自己是否是超级管理员，从而判断是否展示这一块功能。

数据要求：用户信息。

功能实现：添加用户的页面，删除用户的页面，以及页面刷新。

### 5、查看统计表

技术要点：使用echat插件

数据要求：用户信息，统计表信息。

功能实现：实现四个统计表页面。

### 6、退出登录

技术要点：退出登录的实现方法。

数据要求：用户信息。

功能实现：页面跳转。



## 后台接口功能

### 1、新增用户 /adduser

### 2、修改用户信息 /alteruser

### 3、添加心愿 /addwish

### 4、捡瓶子/pickbottle

### 5、修改瓶子pickerid/alterbottlepickerid

### 6、新增心愿瓶回复 /addwishreply

### 7、获取我的所有心愿 /getallwish

### 8、获取捞到的心愿列表 /getpickwish

### 9、获取心愿瓶所有回复列表 /wishreply

### 10、删除心愿 /delwish

### 11、获取所有树洞信息列表(主页)(可能分页) /alltreehole

### 12、更新浏览量 /updatescan

### 13、获得某个树洞的所有回复列表/getreplybytreeholeid

### 14、新增树洞回复/addtreeholereply

### 15、写树洞/addtreehole

### 16、查看我的树洞信息/getmytreehole

### 17、删除树洞/deletetreehole

### 18、删除树洞回复/deletetreeholereply

### 19、插入消息/insertMessage

### 20、阅读消息 /getMessageByMessageId

### 21、消息未读数量nonReadMessageNumber

### 22、消息列表getMyMessageByType

### 23、添加管理员/addAdministrator

### 24、删除管理员/deleteAdministrator

### 25、获取统计信息/getData



















