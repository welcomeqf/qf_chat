package com.dkm.user.entity.vo;

import lombok.Data;

/**
 * @author qf
 * @date 2020/5/11
 * @vesion 1.0
 **/
@Data
public class UserVo {

   /**
    * 用户名
    */
   private String userName;

   /**
    * 密码
    */
   private String password;

   /**
    * 昵称
    */
   private String nickName;

   /**
    * 0--男
    * 1--女
    */
   private Integer sex;
}
