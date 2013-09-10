package com.danandreicarp.learn.designpatterns.templatemethod;

public class TemplateMethodClient {

	public static void main(final String[] args) {
		final BaseTemplate template = new Template();
		template.templateMethod();
	}

}
