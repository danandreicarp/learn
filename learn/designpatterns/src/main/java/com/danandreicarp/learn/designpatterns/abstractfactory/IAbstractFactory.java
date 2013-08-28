package com.danandreicarp.learn.designpatterns.abstractfactory;

public interface IAbstractFactory {
	IProduct createProduct();

	IGift createGift();
}
