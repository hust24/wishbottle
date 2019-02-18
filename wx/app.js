//app.js
App({

  // 全局变量
  globalData:{
    // 微信开发需要的密钥等
    appid: 'wx46c620b64dbd310a',
    secret: 'd5957dea017e538d3960db06c7937dfa',
    // openid
    openid:null,
    // 用户信息
    userInfo: null,
    // 是否有读取用户信息的授权
    hasUserInfoAuthority:true,
  },

  onLaunch: function () {
    // 展示本地存储能力
    var logs = wx.getStorageSync('logs') || []
    logs.unshift(Date.now())
    wx.setStorageSync('logs', logs);

    var that = this;

    // 判断用户是否已经授权获取用户信息
    wx.getSetting({
      success(res) {
        if (!res.authSetting['scope.userInfo']) {
          that.globalData.hasUserInfoAuthority = false;
        }else{
          wx.getUserInfo({
            success: function (res) {
              console.log(res.userInfo);
              that.globalData.userInfo = res.userInfo;
            }
          })
        }
      }
    })

    // 获取openid，并保存在globalData全局变量中
    wx.login({
      success: res => {
        // 发送 res.code 到后台换取 openId, sessionKey, unionId
        var that = this;
        if(res.code){
          var appid = that.globalData.appid;
          var secret = that.globalData.secret;
          var url = 'https://api.weixin.qq.com/sns/jscode2session?appid=' +appid + '&secret=' + secret + '&js_code=' + res.code + '&grant_type=authorization_code';
          wx.request({
            url: url,
            data: {},
            method: 'GET', // OPTIONS, GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT  
            // header: {}, // 设置请求的 header  
            success: function (res) {
              var obj = {};
              that.globalData.openid = res.data.openid;
              console.log(that.globalData.openid);
            }
          });
        }else{
          wx.showToast({
            title: '获取用户登录状态失败',
            icon: 'none',
            duration: 2000
          });
        }
      }
    })

    
  },

})