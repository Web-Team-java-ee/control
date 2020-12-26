package com.example.demo.mapper;

import com.example.demo.model.TaskList;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TaskListMapper {

    @Select("select tl.id,tl.task_index,tl.task_title from user_tb u,task_list_tb tl where u.id=#{id}")
    public List<TaskList> findTaskList(Integer id);

    @Select("select tl.id,tl.task_index,tl.task_title from user_tb u,task_list_tb tl where u.id=#{id} and tl.task_index=#{taskIndex}")
    public TaskList findOneTaskList(Integer id,Integer taskIndex);

    @Insert("insert into task_list_tb(id,task_index,task_title)values(#{id},#{task_index},#{task_title})")
    public void addTaskList(TaskList taskList);
}
