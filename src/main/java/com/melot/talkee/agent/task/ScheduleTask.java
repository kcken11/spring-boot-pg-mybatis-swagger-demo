package com.melot.talkee.agent.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by mn on 2018/3/12.
 */
@Component
public class ScheduleTask {

    @Scheduled(fixedRate = 5000)
    public void printTime() {
        System.out.println(" time now is " + new Date());

    }

}
