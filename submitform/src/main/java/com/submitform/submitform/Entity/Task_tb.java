package com.submitform.submitform.Entity;



import lombok.Data;
import org.omg.PortableInterceptor.ServerRequestInfo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data   //不用写get set
@Entity  //列表
public class Task_tb {
    @Id  //主键
    @GeneratedValue(strategy = GenerationType.AUTO) //主键选择策略
    private Integer task_index;
    private Integer id;
    private String task_name;
    private String task_context;
    private String task_type;
    private Date create_time;
    private Date update_time;
}
