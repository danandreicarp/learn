package com.danandreicarp.learn.designpatterns.chainofresponsability;

public class HandlerB extends AbstractHandler {

	@Override
	protected boolean handle(final IRequest request) {

		if (request.getLevel() >= 0) {
			System.out.println("handling request in handler B");
			return true;
		} else {
			return false;
		}

	}

}
