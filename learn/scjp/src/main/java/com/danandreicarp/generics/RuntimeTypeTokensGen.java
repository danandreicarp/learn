package com.danandreicarp.generics;

import java.util.ArrayList;
import java.util.Collection;

public class RuntimeTypeTokensGen {
	Collection<EmpInfo> emps = select(EmpInfo.class, "select * from emps");

	public static <T> Collection<T> select(final Class<T> c, final String sqlStatement) {
		final Collection<T> result = new ArrayList<T>();

		/* Run sql query using jdbc */
		for (int i = 0; i < 1; i++/* iterate over jdbc results. */) {
			T item;

			try {
				item = c.newInstance();

				/* Use reflection and set all of item's fields from sql results. */
				result.add(item);

			} catch (final InstantiationException e) {
				e.printStackTrace();
			} catch (final IllegalAccessException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

}
