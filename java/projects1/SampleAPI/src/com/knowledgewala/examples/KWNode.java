package com.knowledgewala.examples;

public class KWNode<T extends Comparable<T>> {

	private T data;
	private KWNode<T> next;

	public KWNode(T data) {
		this.data = data;
		setNext(null);
	}

	public KWNode<T> getNext() {
		return next;
	}

	public void setNext(KWNode<T> next) {
		this.next = next;

	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {

		return String.valueOf(data);
	}

}
