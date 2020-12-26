package com.example.demo.model;



import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;
import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.Date;


@Data   //不用写get set
@Table(name="task_tb")  //列表
public class Task {

    @Column(name="id",type=MySqlTypeConstant.INT)
    private Integer id;
    @Column(name="task_id",type=MySqlTypeConstant.INT,isKey = true,isAutoIncrement = true)
    private Integer task_id;

    @Column(name = "task_index",type = MySqlTypeConstant.INT)
    private Integer task_index;
    @Column(name="task_name",type=MySqlTypeConstant.VARCHAR)
    private String task_name;
    @Column(name="task_context",type=MySqlTypeConstant.TEXT)
    private String task_context;
    @Column(name="task_type",type=MySqlTypeConstant.VARCHAR)
    private String task_type;
    @Column(name="create_time",type=MySqlTypeConstant.VARCHAR)
    private String create_time;
    @Column(name="update_time",type = MySqlTypeConstant.VARCHAR)
    private String update_time;

    public Integer getTask_index() {
        return task_index;
    }

    public void setTask_index(Integer task_index) {
        this.task_index = task_index;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getTask_context() {
        return task_context;
    }

    public void setTask_context(String task_context) {
        this.task_context = task_context;
    }

    public String getTask_type() {
        return task_type;
    }

    public void setTask_type(String task_type) {
        this.task_type = task_type;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public Integer getTask_id() {
        return task_id;
    }

    public void setTask_id(Integer task_id) {
        this.task_id = task_id;
    }
}
