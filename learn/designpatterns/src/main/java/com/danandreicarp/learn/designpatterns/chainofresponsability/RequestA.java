package com.danandreicarp.learn.designpatterns.chainofresponsability;

public class RequestA implements IRequest {

	private final int level;

	public RequestA(final int level) {
		this.level = level;
	}

	@Override
	public int getLevel() {
		return level;
	}

}
