package bst;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyBSTTest {

	@Test
	void whenNoNodeAdded_shouldReturn_zeroSize() {
		MyBST<Integer> mybst = new MyBST<>();
		assertEquals(0, mybst.size());
	}

	@Test
	void whenOneNodeAdded_shouldReturn_oneSize() {
		MyBST<Integer> mybst = new MyBST<>();
		mybst.add(56);
		assertEquals(1, mybst.size());
	}

	@Test
	void whenTwoNodesAdded_shouldReturn_twoSize() {
		MyBST<Integer> mybst = new MyBST<>();
		mybst.add(56);
		mybst.add(30);
		assertEquals(2, mybst.size());
	}

	@Test
	void whenThreeNodesAdded_shouldReturn_threeSize() {
		MyBST<Integer> mybst = new MyBST<>();
		mybst.add(56);
		mybst.add(30);
		mybst.add(70);
		assertEquals(3, mybst.size());
	}

}
