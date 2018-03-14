package com.example.demo.service;

import com.example.demo.domain.AdminInfo;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;

/**
 * Created by mn on 2018/3/14.
 */
public interface AdminUserService {
    public AdminInfo getAdminInfoById(Integer adminId);
}
