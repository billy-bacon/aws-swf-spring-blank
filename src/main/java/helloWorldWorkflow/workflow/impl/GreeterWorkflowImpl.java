package helloWorldWorkflow.workflow.impl;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import helloWorldWorkflow.activity.GreeterActivitiesClient;
import helloWorldWorkflow.activity.GreeterActivitiesClientImpl;
import helloWorldWorkflow.workflow.GreeterWorkflow;

public class GreeterWorkflowImpl implements GreeterWorkflow {

	private GreeterActivitiesClient operations = new GreeterActivitiesClientImpl();

	public void greet() {

		Promise<String> name = operations.getName();
		Promise<String> greeting = operations.getGreeting(name);
		operations.say(greeting);

	}

}