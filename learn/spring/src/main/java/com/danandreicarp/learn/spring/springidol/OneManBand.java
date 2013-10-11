package com.danandreicarp.learn.spring.springidol;

import java.util.Properties;

public class OneManBand implements Performer {

	// private Collection<Instrument> instruments;
	// private List<Instrument> instruments;
	// private Instrument[] instruments;
	// private Map<String, Instrument> instruments;
	private Properties instruments;

	public OneManBand() {

	}

	@Override
	public void perform() throws PerformanceException {
		/*
		 * for (final String key : instruments.keySet()) {
		 * System.out.println(key + " : ");
		 * final Instrument instrument = instruments.get(key);
		 * instrument.play();
		 * }
		 */

		for (final Object property : instruments.keySet()) {
			System.out.println(instruments.get(property).toString());
		}
	}

	public void setInstruments(final Properties instruments) {
		this.instruments = instruments;
	}

}
