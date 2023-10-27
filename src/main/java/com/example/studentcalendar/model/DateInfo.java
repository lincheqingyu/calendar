package com.example.studentcalendar.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * 日期信息模型
 * 表示与日期相关的信息，如公历日期、星期、教学周、农历日期、节气和法定节假日
 */
@Entity
public class DateInfo {

    @Id
    private LocalDate date;  // 公历日期
    private String weekday;   // 星期
    private Integer teachingWeek; // 教学周
    private String lunarDate; // 农历日期
    private String solarTerm; // 节气
    private String holidayName;  // 法定节假日名称

    // getters and setters

}