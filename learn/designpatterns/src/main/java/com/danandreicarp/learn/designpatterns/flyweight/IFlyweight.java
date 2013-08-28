package com.danandreicarp.learn.designpatterns.flyweight;

public interface IFlyweight {

	void statefulOperation(ExtrinsicState extrinsicState);

	IntrinsicState getIntrinsicState();

	void setIntrinsicState(IntrinsicState intrinsicState);
}
