package com.simplemep.business;

import java.util.List;

import com.simplemep.model.ITask;

public interface ITaskBusinessController {

	public abstract List<ITask> getTaskList();

}