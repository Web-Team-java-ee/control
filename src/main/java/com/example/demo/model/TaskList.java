package com.example.demo.model;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;

@Data
@Table(name="task_list_tb")
public class TaskList {
    @Column(name="id",type= MySqlTypeConstant.INT)
    private Integer id;
    @Column(name="task_index",type = MySqlTypeConstant.INT)
    private Integer task_index;
    @Column(name = "task_title",type = MySqlTypeConstant.VARCHAR)
    private String task_title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTask_index() {
        return task_index;
    }

    public void setTask_index(Integer task_index) {
        this.task_index = task_index;
    }

    public String getTask_title() {
        return task_title;
    }

    public void setTask_title(String task_title) {
        this.task_title = task_title;
    }

    public TaskList(Integer id, Integer task_index, String task_title) {
        this.id = id;
        this.task_index = task_index;
        this.task_title = task_title;
    }
}
