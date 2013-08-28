package com.danandreicarp.learn.designpatterns.command;

public interface IReceiver {
	void move(int distance);

	void jump(int height);

	void duck();
}
