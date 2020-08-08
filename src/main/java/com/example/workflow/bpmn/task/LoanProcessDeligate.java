package com.example.workflow.bpmn.task;

import java.util.logging.Logger;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanProcessDeligate implements JavaDelegate {

	  private final static Logger LOGGER = Logger.getLogger("LOAN-REQUESTS");
	  
	  @Autowired
	  private RuntimeService runtimeService;

	  public void execute(DelegateExecution execution) throws Exception {
		  
		  //ProcessInstance processInstance = this.runtimeService.g
		  
		  execution.setVariable("duration", "PT20S");
	    LOGGER.info("###################  ################################  Inside LoanProcessDeligate Processing request by ");
	  }
}
