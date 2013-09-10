package com.danandreicarp.learn.designpatterns.proxy;

public class Proxy implements ISubject {

	private String url;

	public Proxy(final String url) {
		this.url = url;
	}

	public void setUrl(final String url) {
		this.url = url;
	}

	@Override
	public void displayResource() {
		System.out.println("proxy display");
		final RealSubject subject = new RealSubject(url);
		subject.displayResource();
	}
}
