package com.danandreicarp.learn.designpatterns.adapter;

public class Adapter implements Target {

	Adaptee adaptee;

	public Adapter(final Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void operation(final TargetObject object) {
		adaptee.specificOperation(adapt(object));
	}

	private AdapteeObject adapt(final TargetObject object) {
		final String[] adapteeFieldList = new String[1];

		adapteeFieldList[0] = object.getField();

		final AdapteeObject adapteeObject = new AdapteeObject(adapteeFieldList);

		return adapteeObject;
	}

}
