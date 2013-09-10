package com.danandreicarp.learn.designpatterns.proxy;

public class RealSubject implements ISubject {

	private final String url;

	public RealSubject(final String url) {
		this.url = url;
		loadResource(url);
	}

	@Override
	public void displayResource() {
		System.out.println("real subject display");
	}

	private void loadResource(final String url) {
		System.out.println("real subject loading resource at: " + url);
	}

}
