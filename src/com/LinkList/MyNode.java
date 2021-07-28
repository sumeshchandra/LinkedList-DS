package com.LinkList;

public class MyNode<K> implements INode<K> {

	private K key;
	private INode next;

	public MyNode(K key) {

		this.key = key;
		this.next = null;
	}

	@Override
	public void setKey(K key) {
		// TODO Auto-generated method stub
		this.key = key;
	}

	@Override
	public K getkey() {
		// TODO Auto-generated method stub
		return this.key;
	}

	@Override
	public void setNext(INode next) {
		// TODO Auto-generated method stub
		this.next = next;

	}

	@Override
	public INode getNext() {
		return this.next;
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return null;
	}

}
