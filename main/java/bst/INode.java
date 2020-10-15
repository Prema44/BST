package bst;

public interface INode<K extends Comparable<K>> {
	public void setKey(K key);
	public K getKey();
}
