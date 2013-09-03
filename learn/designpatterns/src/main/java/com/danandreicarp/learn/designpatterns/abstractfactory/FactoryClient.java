package com.danandreicarp.learn.designpatterns.abstractfactory;

public class FactoryClient {
	private final IProduct product;
	private final IGift gift;

	public FactoryClient(final IAbstractFactory factory) {
		product = factory.createProduct();
		gift = factory.createGift();
	}

	IProduct getProduct() {
		return product;
	}

	IGift getGift() {
		return gift;
	}
}
