package com.dkm.user.entity.vo;

import lombok.Data;

/**
 * @author qf
 * @date 2020/5/11
 * @vesion 1.0
 **/
@Data
public class UserUpdateInfoVo {

   private Long id;

   /**
    * 昵称
    */
   private String nickName;

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
}
