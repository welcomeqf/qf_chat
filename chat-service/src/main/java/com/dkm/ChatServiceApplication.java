package com.dkm;

import com.dkm.aop.beans.Aspect;
import com.dkm.voice.server.VoiceServer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author qf
 */
@EnableSwagger2
@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.dkm.*.dao")
public class ChatServiceApplication extends Aspect {

   public static void main(String[] args) {
      SpringApplication.run(ChatServiceApplication.class, args);
   }

   /**
    * 打包
    * @param builder
    * @return
    */
   @Override
   protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
      return builder.sources(ChatServiceApplication.class);
   }


}
