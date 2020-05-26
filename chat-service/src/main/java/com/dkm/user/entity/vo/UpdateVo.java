package com.dkm.user.entity.vo;

import lombok.Data;

/**
 * @author qf
 * @date 2020/5/11
 * @vesion 1.0
 **/
@Data
public class UpdateVo {

   private Long id;

   /**
    * 老密码
    */
   private String oldPassword;

   /**
    * 新密码
    */
   private String newPassword;
}
