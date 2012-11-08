package com.simplemep.business.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.simplemep.business.ITaskBusinessController;
import com.simplemep.model.ITask;

@Service("taskBusinessController")
public class TaskBusinessController implements ITaskBusinessController {

	@Override
	public List<ITask> getTaskList() {
		return null;
	}
}
