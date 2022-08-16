package com.useful.utils.controller;

import com.useful.utils.common.OsInfoUtils;
import com.useful.utils.common.TokenizerUtils;
import com.useful.utils.common.WriteWordUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 */
@RestController
public class TestController {


    @GetMapping("/hello")
    public String hello(){
        return "hello good job!";
    }


    @GetMapping("/getOsInfo")
    public String getOsInfo(){
        //获取cpu利用率
        OsInfoUtils.getOsInfo();
        //获取内存数据
        OsInfoUtils.getMemoryInfo();
        //获取硬盘使用量
        OsInfoUtils.getDiskUsed();
        return "success";
    }


    @GetMapping("/writeWord")
    public String writeWord(){
        WriteWordUtils.writeWord();
        return "success";
    }


    @GetMapping("/tokenizerWord")
    public String tokenizerWord(){
        TokenizerUtils.tokenizerWord();
        return "success";
    }


}
