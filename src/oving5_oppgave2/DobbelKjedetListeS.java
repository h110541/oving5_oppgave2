package oving5_oppgave2;

public class DobbelKjedetListeS<T extends Comparable<T>> {

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

	public boolean fins(T element) {
		sjekkVerdi(element);

		boolean funnet = false;
		DobbelNode<T> current = forste.getNeste();

		while (element.compareTo(current.getElement()) > 0) {
			current = current.getNeste();
		}

		if (element.compareTo(current.getElement()) == 0) {
			funnet = true;
		}

		return funnet;
	}

	public void leggTil(T element) {
		sjekkVerdi(element);

		DobbelNode<T> current = forste.getNeste();

		while (element.compareTo(current.getElement()) >= 0) {
			current = current.getNeste();
		}

		DobbelNode<T> nyNode = new DobbelNode<T>(element);
		nyNode.setForrige(current.getForrige());
		nyNode.setNeste(current);
		current.getForrige().setNeste(nyNode);
		current.setForrige(nyNode);

		antall++;
	}

	public T fjern(T element) {
		sjekkVerdi(element);

		T resultat = null;
		DobbelNode<T> current = forste.getNeste();

		while (element.compareTo(current.getElement()) > 0) {
			current = current.getNeste();
		}

		if (element.compareTo(current.getElement()) == 0) {
			resultat = current.getElement();

			DobbelNode<T> forrige = current.getForrige();
			DobbelNode<T> neste = current.getNeste();
			forrige.setNeste(neste);
			neste.setForrige(forrige);

			antall--;
		}

		return resultat;
	}

	public void visListe() {
		DobbelNode<T> current = forste.getNeste();

		while (current != siste) {
			System.out.print(current.getElement() + " ");
			current = current.getNeste();
		}

		System.out.println();
	}

	// Hjelpemetode, sjekker om en verdi ligger innenfor tillatt område (minVerdi, maksVerdi).
	// Kaster et unntak dersom verdien er ugyldig.
	private void sjekkVerdi(T element) {
		if (element.compareTo(forste.getElement()) <= 0)
			throw new RuntimeException("Ugyldig verdi (for liten)");

		if (element.compareTo(siste.getElement()) >= 0)
			throw new RuntimeException("Ugyldig verdi (for stor)");
	}

}
