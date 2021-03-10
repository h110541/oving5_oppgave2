package oving5_oppgave2;

public class DobbelNode<T> {

	private DobbelNode<T> neste;
	private DobbelNode<T> forrige;
	private T element;

	public DobbelNode() {
		neste = null;
		forrige = null;
		element = null;
	}

	public DobbelNode(T element) {
		neste = null;
		forrige = null;
		this.element = element;
	}

	public DobbelNode<T> getNeste() {
		return neste;
	}

	public DobbelNode<T> getForrige() {
		return forrige;
	}

	public void setNeste(DobbelNode<T> node) {
		neste = node;
	}

	public void setForrige(DobbelNode<T> node) {
		forrige = node;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

}
