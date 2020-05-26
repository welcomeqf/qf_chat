package com.dkm.voice.controller;

import com.dkm.voice.server.VoiceServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qf
 * @date 2020/5/18
 * @vesion 1.0
 **/
@RestController
@RequestMapping("/v1/voice")
public class VoiceController {

//   @Autowired
//   private VoiceServer voiceServer;
//
//   @GetMapping("/getVoice")
//   public void getVoice () {
//      voiceServer.run();
//   }
}
