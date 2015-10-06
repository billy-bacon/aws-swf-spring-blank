package helloWorld.workflow.impl;

import helloWorld.activity.GreeterActivities;
import helloWorld.activity.impl.GreeterActivitiesImpl;
import helloWorld.workflow.GreeterWorkflow;

public class GreeterWorkflowImpl implements GreeterWorkflow {

	private GreeterActivities operations = new GreeterActivitiesImpl();

	public void greet() {

		String name = operations.getName();
		String greeting = operations.getGreeting(name);
		operations.say(greeting);

	}

}