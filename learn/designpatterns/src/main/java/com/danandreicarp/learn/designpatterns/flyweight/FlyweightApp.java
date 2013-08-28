package com.danandreicarp.learn.designpatterns.flyweight;

public class FlyweightApp {

	public static void main(final String[] args) {
		final FlyweightClient[] clients = { new FlyweightClient("one"), new FlyweightClient("two"),
				new FlyweightClient("two"), new FlyweightClient("one") };

		FlyweightClient previous = null;

		for (int i = 0; i < clients.length; i++) {

			final ExtrinsicState extrinsicState = new ExtrinsicState(i);
			clients[i].statefulOperation(extrinsicState);

			if (i > 0) {
				System.out.println(clients[i].getFlyweight().equals(previous.getFlyweight()));
			}

			previous = clients[i];
		}
	}
}
