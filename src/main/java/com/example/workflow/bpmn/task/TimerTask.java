package com.example.workflow.bpmn.task;

import java.util.Date;
import java.util.List;

import org.camunda.bpm.engine.ManagementService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.camunda.bpm.engine.runtime.Job;
import org.springframework.stereotype.Component;

@Component(value = "TimerTask")
public class TimerTask  implements JavaDelegate
{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		System.out.println("Returning the log message :::: ");
	}
	
	public String duration() {
		return "PT10S";
	}


}
