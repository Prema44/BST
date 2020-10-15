package bst;

public class MyBST<K extends Comparable<K>> {
	private MyBinaryNode<K> root;

	public boolean add(K key) {
		this.root = addToBST(root, key);
		return true;
	}

	/**
	 * Recursively adds node to BST
	 */
	private MyBinaryNode<K> addToBST(MyBinaryNode<K> current, K key) {
		if (current == null) {
			return new MyBinaryNode<>(key);
		}
		int compareResult = key.compareTo(current.key);
		if(compareResult == 0) return current;
		if (compareResult < 0)
			current.leftNode = addToBST(current.leftNode, key);
		else
			current.rightNode = addToBST(current.rightNode, key);
		return current;

	}

	public int size() {
		return getSize(root);
	}

	/**
	 * Recursively gets size of BST
	 */
	public int getSize(MyBinaryNode<K> current) {
		return (current == null) ? 0 : 1 + getSize(current.leftNode) + getSize(current.rightNode);
	}

}
