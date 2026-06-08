package com.primetrade.task_management_api.service;
import com.primetrade.task_management_api.entity.Task;
import com.primetrade.task_management_api.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private final TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository){
        this.taskRepository=taskRepository;
    }
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }
    public Task createTask(Task  task){
        return taskRepository.save(task);
    }
    public Task saveTask(Task task){
        return taskRepository.save(task);
    }
    public Task updateTask(Long id, Task updatedTask){
        Task task = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        task.setTitle(updatedTask.getTitle());
        task.setDescription(updatedTask.getDescription());
        task.setCompleted(updatedTask.isCompleted());
        return taskRepository.save(task);
    }
    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }

}
