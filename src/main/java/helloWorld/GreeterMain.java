package helloWorld;

import helloWorld.workflow.GreeterWorkflow;
import helloWorld.workflow.impl.GreeterWorkflowImpl;

public class GreeterMain {

	public static void main(String[] args) {
		final GreeterWorkflow greeter = new GreeterWorkflowImpl();
		greeter.greet();
	}

}
