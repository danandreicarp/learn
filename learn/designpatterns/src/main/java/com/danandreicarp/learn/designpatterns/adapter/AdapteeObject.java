package com.danandreicarp.learn.designpatterns.adapter;

public class AdapteeObject {
	String[] fieldList;

	public AdapteeObject(final String[] fieldList) {
		this.fieldList = fieldList;
	}

	public String[] getFieldList() {
		return fieldList;
	}

	public void setFieldList(final String[] fieldList) {
		this.fieldList = fieldList;
	}

}
