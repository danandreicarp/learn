package com.danandreicarp.learn.designpatterns.state;

public class StateClient {

	public static void main(final String[] args) {
		final IState state = new StateA();

		final Context context = new Context(state);

		context.request();
		context.request();
		context.request();
		context.optionalRequest();
	}
}
