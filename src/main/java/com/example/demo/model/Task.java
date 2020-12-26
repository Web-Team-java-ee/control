package com.example.demo.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Task {
    private Integer id;//对应用户的id
    private Integer taskIndex;//对应列表
    private String taskName; //任务的名称
    private String taskContent;//任务的内容
    private String TaskType;//任务的类型（done与undone）

}
