package com.dkm.friend.entity.bo;

import lombok.Data;

/**
 * @author qf
 * @date 2020/5/16
 * @vesion 1.0
 **/
@Data
public class FriendAllListBo {

   /**
    * 好友的用户id
    */
   private Long toId;

   /**
    * 昵称
    */
   private String nickName;

   /**
    * 头像地址
    */
   private String headUrl;

   /**
    * 备注
    */
   private String remark;
}
