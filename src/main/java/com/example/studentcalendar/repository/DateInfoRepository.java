package com.example.studentcalendar.repository;

import com.example.studentcalendar.model.DateInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;

/**
 * 日期信息仓库
 * 提供与 DateInfo 相关的数据库操作方法
 */
public interface DateInfoRepository extends JpaRepository<DateInfo, LocalDate> {}