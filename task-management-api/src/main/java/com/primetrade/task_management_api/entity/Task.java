package com.primetrade.task_management_api.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private boolean completed;

    public boolean isCompleted(){
        return completed;
    }
    public void setCompleted(boolean completed){
        this.completed=completed;
    }
}