package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CounterTest {

	Counter counter = new Counter();

	@Test
	@DisplayName("初期状態")
	void test1() {
		assertEquals(1, counter.increment());
	}

	@Test
	@DisplayName("1回実行した状態")
	void test2() {
		counter.increment();
		assertEquals(2, counter.increment());
	}

	@Test
	@DisplayName("50回実行した状態")
	void test3() {
		for (int i = 0; i < 50; i++) {
			counter.increment();
		}
		assertEquals(51, counter.increment());
	}

}
