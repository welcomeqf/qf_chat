package com.dkm.manyChat.service;

import com.dkm.manyChat.entity.ManyChat;
import com.dkm.manyChat.entity.vo.ManyChatVo;

/**
 * @author qf
 * @date 2020/5/15
 * @vesion 1.0
 **/
public interface IManyChatService {

   /**
    *  建立群聊
    * @param vo 建立群聊信息
    */
   void insertManyChat(ManyChatVo vo);

   /**
    *  根据id查询群聊信息
    * @param id 群聊Id
    * @return 返回群聊的资料
    */
   ManyChat queryById (Long id);
}
