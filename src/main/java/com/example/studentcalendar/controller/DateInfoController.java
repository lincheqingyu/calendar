package com.example.studentcalendar.controller;

import com.example.studentcalendar.model.DateInfo;
import com.example.studentcalendar.service.DateInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.util.Optional;

/**
 * 日期信息控制器
 * 处理与日期信息相关的请求
 */
@RestController
@RequestMapping("/dateInfo")
public class DateInfoController {

    @Autowired
    private DateInfoService dateInfoService;

    @GetMapping
    public Optional<DateInfo> getDateInfoByDate(@RequestParam LocalDate date) {
        return dateInfoService.getDateInfoByDate(date);
    }

    // 其他端点方法
}