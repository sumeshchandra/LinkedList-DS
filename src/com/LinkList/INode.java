package com.LinkList;

public interface INode<K> {

	void setKey(K key);
	K getKey();
	
	void setNext(INode next);
	INode getNext();
	K getkey();
	
}
