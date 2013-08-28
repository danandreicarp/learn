package com.danandreicarp.learn.designpatterns.abstractfactory;

public class FactoryA implements IAbstractFactory {

	@Override
	public IProduct createProduct() {
		return new ProductA();
	}

	@Override
	public IGift createGift() {
		return new GiftA();
	}
}
