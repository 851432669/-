package com.sky.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class MyTask {
    /**
     * 定时任务
     */
//    @Scheduled(cron = "0/5 * * * * ?")
    public void executeTask() {
        log.info("当前时间：{}，正在执行定时任务", new Date());
    }


}
