package com.danandreicarp.learn.designpatterns.proxy;

public class ProxyClient {

	public static void main(final String[] args) {
		final ISubject subject = new Proxy("path-to-resource");

		subject.displayResource();
	}

}
