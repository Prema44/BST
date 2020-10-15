package bst;

public class MyBinaryNode<K extends Comparable<K>> implements INode<K> {
	K key;
	MyBinaryNode<K> leftNode;
	MyBinaryNode<K> rightNode;

	public MyBinaryNode(K key) {
		this.key = key;
		this.leftNode = null;
		this.rightNode = null;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public K getKey() {
		return key;
	}
}	
