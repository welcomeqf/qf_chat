package com.dkm.manyChat.entity.vo;

import lombok.Data;


/**
 * @author qf
 * @date 2020/7/4
 * @vesion 1.0
 **/
@Data
public class ManyChatResultVo {

   private Long id;

   /**
    * 群头像
    */
   private String headUrl;

   /**
    * 群聊名字
    */
   private String manyName;

   /**
    * 群聊二维码
    */
   private String manyQrCode;

   /**
    * 公告
    */
   private String manyNotice;

   /**
    * 群备注
    */
   private String manyRemark;

   /**
    * 创建时间
    */
   private String createDate;
}
