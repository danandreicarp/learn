package com.danandreicarp.learn.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	static Map<String, IFlyweight> flyweightMap = new HashMap<String, IFlyweight>();

	public static IFlyweight getFlyweight(final String key) {

		IntrinsicState intrinsicState;

		if (flyweightMap.get(key) == null) {
			IFlyweight flyweight = null;

			if (key == "one") {
				intrinsicState = new IntrinsicState("one", 5);
				flyweight = new FlyweightA(intrinsicState);
			} else if ("two".equals(key)) {
				intrinsicState = new IntrinsicState("two", 3);
				flyweight = new FlyweightB(intrinsicState);
			}

			flyweightMap.put(key, flyweight);
		}

		return flyweightMap.get(key);
	}

}
