package com.submitform.submitform;
import com.submitform.submitform.Entity.Task_tb;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task_tb,Long> {
//实体类增删改查

}
