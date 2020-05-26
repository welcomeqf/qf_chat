package com.dkm.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author qf
 * @date 2020/5/11
 * @vesion 1.0
 **/
@Data
@TableName("tb_user")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class User extends Model<User> {


   private Long id;

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
}
