package oving5_oppgave2;

public class Klient {

	public static void main(String[] args) {

		DobbelKjedetListeS<Integer> l = new DobbelKjedetListeS<Integer>(0, 1000);

		l.leggTil(43);
		l.leggTil(92);
		l.leggTil(60);
		l.leggTil(44);
		l.leggTil(54);
		l.leggTil(97);
		l.leggTil(51);
		l.leggTil(79);
		l.leggTil(80);
		l.leggTil(39);

		System.out.println("Liste før sletting av 44:");
		l.visListe();

		System.out.format("%n44 finnes i listen: %s%n", l.fins(44));
		l.fjern(44);
		System.out.format("44 finnes i listen: %s%n", l.fins(44));

		System.out.println("\nListe etter sletting av 44:");
		l.visListe();

	}
}
