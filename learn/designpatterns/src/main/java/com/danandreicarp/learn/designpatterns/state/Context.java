package com.danandreicarp.learn.designpatterns.state;

public class Context {
	IState state;

	public Context(final IState state) {
		this.state = state;
	}

	public void request() {
		state.handle(this);
	}

	public void optionalRequest() {
		if (state instanceof IStateOptional) {
			((IStateOptional) state).optionalOperation(this);
		}
	}

	public IState getState() {
		return state;
	}

	public void setState(final IState state) {
		this.state = state;
	}

}
