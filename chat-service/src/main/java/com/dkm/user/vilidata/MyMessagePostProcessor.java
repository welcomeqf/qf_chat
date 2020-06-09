package com.dkm.user.vilidata;

import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;

/**
 * @author qf
 * @date 2020/6/8
 * @vesion 1.0
 **/
public class MyMessagePostProcessor implements MessagePostProcessor {

   private final Integer ttl;

   public MyMessagePostProcessor (final Integer ttl) {
      this.ttl = ttl;
   }

   @Override
   public Message postProcessMessage(final Message message) throws AmqpException {
      message.getMessageProperties().getHeaders().put("expiration",ttl.toString());
      return message;
   }
}
