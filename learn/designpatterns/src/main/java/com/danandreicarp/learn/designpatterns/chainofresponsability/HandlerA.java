package com.danandreicarp.learn.designpatterns.chainofresponsability;

public class HandlerA extends AbstractHandler {

	@Override
	public boolean handle(final IRequest request) {

		if (request.getLevel() < 0) {
			System.out.println("handling request in handler A");
			return true;
		} else {
			return false;
		}

	}

}
