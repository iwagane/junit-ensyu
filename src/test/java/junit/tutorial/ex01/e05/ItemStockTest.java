package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ItemStockTest {

	Item item = new Item("book", 1000);
	ItemStock itemStock = new ItemStock();

	@Test
	@DisplayName("初期状態")
	void test() {
		item = new Item("book", 1000);
		assertEquals(0, itemStock.getNum(item));
	}

	@Test
	@DisplayName("初期状態でitem追加")
	void test2() {
		itemStock.add(item);
		assertEquals(1, itemStock.getNum(item));
	}

	@Test
	@DisplayName("itemを1つ追加状態")
	void test3() {
		itemStock.add(item);
		assertEquals(1, itemStock.getNum(item));
	}

	@Test
	@DisplayName("itemを1つ追加状態で同じitem追加")
	void test4() {
		itemStock.add(item);
		itemStock.add(item);
		assertEquals(2, itemStock.getNum(item));
	}

	@Test
	@DisplayName("itemを1つ追加状態で違うitem追加")
	void test5() {
		itemStock.add(item);
		Item item2 = new Item("CD", 1000);
		itemStock.add(item2);
		assertEquals(1, itemStock.getNum(item));
	}

}
