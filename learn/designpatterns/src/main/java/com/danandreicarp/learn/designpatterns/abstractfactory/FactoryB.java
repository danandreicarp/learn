package com.danandreicarp.learn.designpatterns.abstractfactory;

public class FactoryB implements IAbstractFactory {

	@Override
	public IProduct createProduct() {
		return new ProductB();
	}

	@Override
	public IGift createGift() {
		return new GiftB();
	}

}
