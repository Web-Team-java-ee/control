package com.example.demo.Mapper;

import com.example.demo.model.Task;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TaskMapper {
    @Select("select * from task")
    List<Task> list();

    int addTask(@Param("task")Task task);
}
