package com.cursojava.taskmanager.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cursojava.taskmanager.models.Task;
import com.cursojava.taskmanager.repositories.TaskRepository;

@Service
public class TaskService {

	private final TaskRepository taskRepository;

	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	public Task createTask(Task myTask) {
		return taskRepository.save(myTask);
	}

	public List<Task> getAll() {
		return (List<Task>) taskRepository.findAll();
	}

	public Task findTaskById(Long id) {
		Optional<Task> mytask = taskRepository.findById(id);
		if (mytask.isPresent()) {
			return mytask.get();
		} else {
			System.out.println("no task you are looking for");
			return null;
		}
	}

	public void deleteTask(Long myId) {
		taskRepository.deleteById(myId);
	}

	public void updateTask(Task myTask) {
		taskRepository.save(myTask);
	}
}
