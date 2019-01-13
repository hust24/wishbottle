// pages/AlertPage/AlertPage.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    id:"",
    name: "",
    phone:"",
    address:"",
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var that = this;
    that.setData(
      {
        id:options.id,
        name:options.name,
        phone:options.phone,
        address:options.address,
      }
    );
  },

  /**修改姓名 */
  changeName:function(event){
    var that = this;
    that.setData({
      name:event.detail.value
    });
    console.log("name=" + that.data.name);
  },

  /**修改电话 */
  changePhone: function (event) {
    var that = this;
    that.setData({
      phone: event.detail.value
    });
    console.log("phone=" + that.data.phone);
  },

  /**修改地址 */
  changeAddress: function (event) {
    var that = this;
    that.setData({
      address: event.detail.value
    });
    console.log("address=" + that.data.address);
  },

  /**修改学生信息 */
  alertData:function(){
    var that = this;
    console.log(that.data.id + ',' + that.data.name + ',' + that.data.phone + ',' + that.data.address);
    wx.request({
      // url: 'http://localhost:8080/stu/updatestu?stuID=' + that.data.id + '&stuName=' + that.data.name + '&stuPhone=' + that.data.phone + '&stuAddress=' + that.data.address,
      url: 'http://134.175.155.208:8080/stu/updatestu?stuID=' + that.data.id + '&stuName=' + that.data.name + '&stuPhone=' + that.data.phone + '&stuAddress=' + that.data.address,
      method: 'PUT',
      header: {
        'content-type': 'application/json'
      },
      success: function (res) {
        console.log(res.data);
        wx.redirectTo({
          url: '../FirstPage/FirstPage',
        })
      }
    })
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