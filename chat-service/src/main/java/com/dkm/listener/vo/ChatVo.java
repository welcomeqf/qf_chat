package com.dkm.listener.vo;

import lombok.Data;

/**
 * @author qf
 * @date 2020/6/20
 * @vesion 1.0
 **/
@Data
public class ChatVo {


   /**
    *  与谁的记录
    */
   private Long id;

   /**
    * 消息内容
    */
   private String msg;

   /**
    * 名字
    */
   private String chatName;

   /**
    * 头像
    */
   private String headUrl;

   /**
    * 时间
    */
   private String date;
}
