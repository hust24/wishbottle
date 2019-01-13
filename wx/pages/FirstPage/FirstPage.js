var app = getApp()

Page({

  data: {
    data: "数据展示",
  },

  onLoad: function () {
    var that = this;
    // console.log(app.globalData.test); // 测试globalData
    that.getData();
  },

  getData:function(){
    var that = this;
    wx.request({
      // url: 'http://localhost:8080/stu/all',
      url:'http://134.175.155.208:8080/stu/all',
      header: {
        'content-type': 'application/json'
      },
      success: function (res) {
        console.log(res.data)
        that.setData(
          {
            list: res.data
          }
        )
      }
    })
  },

  /**跳转到添加数据的页面 */
  addData:function(){
    var that = this;
    wx.redirectTo({
      url: '../AddPage/AddPage',
    })
  },

  /**跳转到修改信息页面 */
  alertData:function(event){
    var student = event.currentTarget.dataset.alert;
    console.log(student.stuPhone);
    wx: wx.redirectTo({
      url: '../AlertPage/AlertPage?id=' + student.stuID + '&name=' + student.stuName + '&phone=' + student.stuPhone + '&address=' + student.stuAddress,
    })
  },

  /**删除数据 */
  deleteData:function(event){
    var that = this;
    wx.request({
      // url: 'http://localhost:8080/stu/del/'+event.currentTarget.dataset.delete.stuID,
      url: 'http://134.175.155.208:8080/stu/del/' + event.currentTarget.dataset.delete.stuID,
      method:'DELETE',
      header: {
        'content-type': 'application/json'
      },
      success: function (res) {
        console.log(res.data);
        that.onLoad();
      }
    })
  },
  
  // 测试git

})