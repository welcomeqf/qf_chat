package com.dkm.friend.entity.bo;

import lombok.Data;

/**
 * @author qf
 * @date 2020/5/15
 * @vesion 1.0
 **/
@Data
public class FriendBo {

   private Long id;

   /**
    * 用户名
    */
   private String userName;

   /**
    * 昵称
    */
   private String nickName;

   /**
    * 头像地址
    */
   private String headUrl;

   /**
    * 二维码地址
    */
   private String qrCode;

   /**
    * 0--男
    * 1--女
    */
   private Integer sex;

   /**
    * 地区
    */
   private String address;

   /**
    * 个性签名
    */
   private String sign;

   /**
    * 0--好友
    * 2--拉黑
    */
   private Integer status;

   /**
    * 备注
    */
   private String remark;
}
