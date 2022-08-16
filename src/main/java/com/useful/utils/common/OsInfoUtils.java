package com.useful.utils.common;

import cn.hutool.system.oshi.CpuInfo;
import cn.hutool.system.oshi.OshiUtil;
import java.io.File;
import java.text.DecimalFormat;


/**
 * @author admin
 */
public class OsInfoUtils {

    /**
     * 获取cpu利用率
     */
    public static void getOsInfo(){
        CpuInfo cpuInfo = OshiUtil.getCpuInfo();
        double free = cpuInfo.getFree();
        DecimalFormat format = new DecimalFormat("#.00");
        System.out.println("cpu利用率：" + Double.parseDouble(format.format(100.0D - free)));
    }

    /**
     * 获取内存数据
     */
    public static void getMemoryInfo(){
        System.out.println("内存总量：" + OshiUtil.getMemory().getTotal()/1024/1024);
        System.out.println("已用内存：" + OshiUtil.getMemory().getAvailable()/1024/1024);
    }

    /**
     * 获取硬盘使用量
     */
    public static void getDiskUsed(){
        File win = new File("/");
        if (win.exists()) {
            long total = win.getTotalSpace();
            long freeSpace = win.getFreeSpace();
            System.out.println("磁盘总量：" + total/1024/1024/1024);
            System.out.println("磁盘剩余总量：" + freeSpace/1024/1024/1024);
            System.out.println("磁盘已用总量：" + (total - freeSpace)/1024/1024/1024);
        }
    }
}
