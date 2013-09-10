package com.danandreicarp.learn.designpatterns.chainofresponsability;

public class ChainClient {

	public static void main(final String[] args) {
		final IRequest requestA = new RequestA(-5);
		final IRequest requestB = new RequestA(5);

		final AbstractHandler handlerA = new HandlerA();
		final AbstractHandler handlerB = new HandlerB();

		handlerA.setSuccessor(handlerB);

		handlerA.handleRequest(requestA);
		handlerA.handleRequest(requestB);
	}

}
