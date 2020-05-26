package com.dkm.file.controller;

import com.dkm.constanct.CodeType;
import com.dkm.exception.ApplicationException;
import com.dkm.file.service.IFileService;
import com.dkm.file.utils.FileUtils;
import com.dkm.file.utils.FileVo;
import com.dkm.utils.IdGenerator;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author qf
 * @date 2020/4/11
 * @vesion 1.0
 **/
@Api(tags = "上传文件api")
@Slf4j
@RestController
@RequestMapping("/v1/file")
public class FileController {

  @Autowired
  private IFileService fileService;

   /**
    * 上传文件图片到本地工程
    * @param file
    * @return
    * @throws Exception
    */
   @PostMapping("/storeFile")
   @CrossOrigin
   public FileVo storeFile(@RequestBody MultipartFile file) {

      if (file == null) {
         throw new ApplicationException(CodeType.PARAMETER_ERROR, "未上传文件");
      }

      return fileService.storeFile(file);
   }


   @GetMapping("/getQrCode")
   public FileVo getQrCode () {
      //生成二维码并上传服务器
      return fileService.getQrCode("http://www.baidu.com");
   }

}
