package com.example.studentcalendar.service;

import com.example.studentcalendar.model.DateInfo;
import com.example.studentcalendar.repository.DateInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.Optional;

/**
 * 日期信息服务
 * 提供与日期信息相关的业务逻辑
 */
@Service
public class DateInfoService {

    @Autowired
    private DateInfoRepository dateInfoRepository;

    public Optional<DateInfo> getDateInfoByDate(LocalDate date) {
        return dateInfoRepository.findById(date);
    }

    // 其他业务方法
}
