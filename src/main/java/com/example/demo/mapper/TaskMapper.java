package com.example.demo.mapper;

import com.example.demo.model.Task;
import com.example.demo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TaskMapper {

    @Insert("insert into task_tb (id,task_index,task_name,task_context,task_type,create_time,update_time) VALUES (#{id},#{task_index},#{task_name},#{task_context},#{task_type},#{create_time},#{update_time})")
    public void save(Task task);


    @Select("select * from task_tb")
    public List<Task> findAll();

    @Select("select t.id,tl.task_index,t.task_id,t.task_name,t.task_context,t.task_type from  task_list_tb tl ,task_tb t where tl.id=t.id and tl.task_index=t.task_index and tl.id=#{id} and tl.task_index=#{taskIndex}")
    public List<Task> getTask(Integer id,Integer taskIndex);

    @Select("select * from task_tb where task_index=#{task_index} and id=#{id} group by task_index limit 1")
    public Task getOneTask(Integer task_index,Integer id);

    @Select("select * from task_tb t where  t.task_id=#{id}")
    public Task findByIDTask(Integer id);


    @Select("select * from task_tb t where  t.id=#{id} and t.task_index=#{currentIndex} and t.task_name like #{content}")
    public List<Task> search(Integer id,Integer currentIndex,String content);
}
