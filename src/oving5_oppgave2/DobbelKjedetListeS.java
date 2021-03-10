package oving5_oppgave2;

public class DobbelKjedetListeS<T> {

	private DobbelNode<T> forste;
	private DobbelNode<T> siste;
	private int antall;

	public DobbelKjedetListeS(T minVerdi, T maksVerdi) {

		forste = new DobbelNode<T>(minVerdi);
		siste = new DobbelNode<T>(maksVerdi);

		forste.setNeste(siste);
		siste.setForrige(forste);

		antall = 0;
	}

}
