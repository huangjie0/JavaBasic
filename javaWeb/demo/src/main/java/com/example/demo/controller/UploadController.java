package com.example.demo.controller;

import com.example.demo.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@RestController
@Slf4j
public class UploadController {
    @PostMapping("/upload")
    public Result upload(String username, Integer age, MultipartFile image) throws Exception {
        log.info("文件上传：{}，{}，{}",username,age,image);
        //将文件存储在磁盘目录中 E：\image
        image.transferTo(new File("E:\\image\\" + image.getOriginalFilename()));
        return Result.success();
    }
}
