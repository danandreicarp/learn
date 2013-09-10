package com.danandreicarp.learn.designpatterns.chainofresponsability;

public abstract class AbstractHandler {

	private AbstractHandler successor;

	public void setSuccessor(final AbstractHandler handler) {
		successor = handler;
	}

	public final void handleRequest(final IRequest request) {
		if (!handle(request) && successor != null) {
			successor.handleRequest(request);
		}
	}

	protected abstract boolean handle(IRequest request);
}
