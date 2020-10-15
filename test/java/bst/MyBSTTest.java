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
	
	@Test
	void whenAllNodesAdded_shouldReturn_itsSize() {
		MyBST<Integer> mybst = new MyBST<>();
		mybst.add(56);
		mybst.add(30);
		mybst.add(70);
		mybst.add(22);
		mybst.add(40);
		mybst.add(11);
		mybst.add(3);
		mybst.add(16);
		mybst.add(60);
		mybst.add(95);
		mybst.add(65);
		mybst.add(63);
		mybst.add(67);
		assertEquals(13, mybst.size());
	}
	
	@Test
	void ifNodeNodePresent_shouldReturn_false() {
		MyBST<Integer> mybst = new MyBST<>();
		mybst.add(56);
		mybst.add(30);
		mybst.add(70);
		mybst.add(22);
		mybst.add(40);
		mybst.add(11);
		mybst.add(3);
		mybst.add(16);
		mybst.add(60);
		mybst.add(95);
		mybst.add(65);
		mybst.add(63);
		mybst.add(67);
		assertFalse(mybst.search(100));
		
	}

}
