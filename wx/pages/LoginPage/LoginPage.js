// pages/LoginPage/LoginPage.js

const app = getApp();

Page({

  /*
   * 页面的初始数据
   */
  data: {

  },

  // 先判断是否有授权
  checkPermission:function(e){
    var that = this;
    if(e.detail.userInfo){
      // 有授权就跳转
      that.checkUserInfo();
    }
  },

  // 判断是否获取了用户信息
  checkUserInfo:function(){
    var that = this;
    if(app.globalData.userInfo == null){
      wx.getUserInfo({
        success: function (res) {
          app.globalData.userInfo = res.userInfo;
          // 成功获取用户信息之后判断是否是第一次登录
          that.checkFirstLogin();
        }
      })
    }else{
      that.checkFirstLogin();
    }
  },

  // 判断该用户是否是第一次登录我们的系统
  checkFirstLogin:function(){
    var that = this;
    console.log(app.globalData.userInfo);
    wx.request({
      url: 'http://localhost:8080/user/finduser', // 仅为示例，并非真实的接口地址
      data: {
        id: 1,
      },
      method: 'GET',
      header: {
        'content-type': 'application/json' // 默认值
      },
      success(res) {
        // code为0表示没找到数据 说明是第一次登录 需要把数据写进数据库
        if(res.data.code == 1){
          that.registerUser();
        }else{
          console.log("不是第一次登录，直接跳转页面");
        }
      }
    })
  },

  // 添加用户到数据库
  registerUser:function(){
    console.log(app.globalData.openid);
    console.log(app.globalData.userInfo.nickName);
    console.log(app.globalData.userInfo.avatarUrl);
    console.log(app.globalData.userInfo.gender);
    wx.request({
      url: 'http://localhost:8080/user/adduser', 
      data: {
        id: app.globalData.openid,
        name: app.globalData.userInfo.nickName,
        avatar: app.globalData.userInfo.avatarUrl,
        gender: app.globalData.userInfo.gender,
        age:18,
      },
      method: 'GET', // TODO 这个地方用POST会报错
      header: {
        'content-type': 'application/json' // 默认值
      },
      success(res) {
        // 添加成功
        console.log(res);
        if (res.data.code == 0) {
          console.log("注册成功，将进行页面跳转");
        } else {
          console.log("注册失败");
        }
      }
    })
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})