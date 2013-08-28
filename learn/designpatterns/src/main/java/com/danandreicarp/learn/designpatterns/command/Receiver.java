package com.danandreicarp.learn.designpatterns.command;

public class Receiver implements IReceiver {

	@Override
	public void move(final int distance) {
		if (distance > 0) {
			System.out.println("moving forward " + distance);
		} else {
			System.out.println("moving backward " + distance);
		}
	}

	@Override
	public void jump(final int height) {
		System.out.println("jumping " + height);
	}

	public void duck() {
		System.out.println("ducking ");
	}
}
