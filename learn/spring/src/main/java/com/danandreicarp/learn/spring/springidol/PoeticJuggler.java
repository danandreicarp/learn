package com.danandreicarp.learn.spring.springidol;

public class PoeticJuggler extends Juggler {
	private final Poem poem;

	public PoeticJuggler(final Poem poem) {
		super();
		this.poem = poem;
	}

	public PoeticJuggler(final int beanBags, final Poem poem) {
		super(beanBags);
		this.poem = poem;
	}

	@Override
	public void perform() throws PerformanceException {
		super.perform();
		System.out.println("While reciting...");
		poem.recite();
	}
}
