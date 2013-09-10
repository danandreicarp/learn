package com.danandreicarp.learn.spring.springidol;

public class Instrumentalist implements Performer {

	private String song;
	private Instrument instrument;

	public Instrumentalist() {

	}

	@Override
	public void perform() throws PerformanceException {
		System.out.println("Playing " + song + " : ");
		instrument.play();
	}

	public String screamSong() {
		return song.toUpperCase();
	}

	public String getSong() {
		return song;
	}

	public void setSong(final String song) {
		this.song = song;
	}

	public void setInstrument(final Instrument instrument) {
		this.instrument = instrument;
	}
}
