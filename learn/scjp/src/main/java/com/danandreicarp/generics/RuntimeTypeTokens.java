package com.danandreicarp.generics;

import java.util.ArrayList;
import java.util.Collection;

interface Factory<T> {
	T make();
}

public class RuntimeTypeTokens {
	public <T> Collection<T> select(final Factory<T> factory, final String statement) {
		final Collection<T> result = new ArrayList<T>();

		/* Run sql query using jdbc */
		for (int i = 0; i < 1; i++/* iterate over jdbc results. */) {
			final T item = factory.make();
			/* Use reflection and set all of item's fields from sql results. */
			result.add(item);
		}

		return result;
	}

	/* call as */
	/*
	 * select(new Factory<EmpInfo>() {
	 * public EmpInfo make() {
	 * return new EmpInfo();
	 * }}, "selection string");
	 */
}

class EmpInfoFactory implements Factory<EmpInfo> {
	@Override
	public EmpInfo make() {
		return new EmpInfo();
	}
}

/* call as */
/* select(getMyEmpInfoFactory(), "selection string"); */
