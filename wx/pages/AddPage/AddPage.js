// pages/AddPage/AddPage.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    name:"",
    phone:"",
    address:"",
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

  },

  /**添加姓名 */
  changeName: function (event) {
    var that = this;
    that.setData({
      name: event.detail.value
    });
    console.log("name=" + that.data.name);
  },

  /**添加电话 */
  changePhone: function (event) {
    var that = this;
    that.setData({
      phone: event.detail.value
    });
    console.log("phone=" + that.data.phone);
  },

  /**添加地址 */
  changeAddress: function (event) {
    var that = this;
    that.setData({
      address: event.detail.value
    });
    console.log("address=" + that.data.address);
  },

  /**添加学生数据 */
  addData: function () {
    var that = this;
    wx.request({
      // url: 'http://localhost:8080/stu/add?stuName='+that.data.name+'&stuPhone='+that.data.phone+'&stuAddress='+that.data.address,
      url: 'http://134.175.155.208:8080/stu/add?stuName=' + that.data.name + '&stuPhone=' + that.data.phone + '&stuAddress=' + that.data.address,
      method:'POST',
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