package com.danandreicarp.learn.designpatterns.abstractfactory;

public class AbstractFactoryMain {

	public static void main(final String[] args) {
		FactoryClient client = new FactoryClient(new FactoryA());

		System.out.println(client.getProduct());
		System.out.println(client.getGift());

		client = new FactoryClient(new FactoryB());

		System.out.println(client.getProduct());
		System.out.println(client.getGift());
	}
}
