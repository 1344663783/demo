package com.example.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @ClassName QuartzService
 * @Description TODO
 * @Author zhangxiaoxiong
 * @Date 2018/12/5 14:48
 * @Version 1.0
 **/
@Component
public class QuartzService {

    @Scheduled(cron = "0 0/1 * * * ?")
    public void timerToNow() {
        System.out.println("now time:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        System.out.println("一分钟了");
    }

    @Scheduled(fixedRate = 5000)   //上一次启动时间点之后X秒执行一次
    public void timerToZZP() {
        System.out.println("ZZP:" + new Random().nextLong() + new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }

    @Scheduled(fixedDelay = 50000)  //上次结束时间点之后X秒执行一次
    public void timerToReportCount() {
        for (int i = 0; i < 10; i++) {
            System.out.println("<================its" + i + "count===============>" + new SimpleDateFormat("HH:mm:ss").format(new Date()));
        }
    }

    @Scheduled(initialDelay = 50000, fixedRate = 6000)  //第一次延迟X秒执行，之后按照fixedRate的规则每X秒执行
    public void timerToReport() {
        for (int i = 0; i < 10; i++) {
            System.out.println("<================delay :" + i + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "count===============>");
        }
    }
}
