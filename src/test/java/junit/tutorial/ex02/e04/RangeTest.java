package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RangeTest {

	Range range = new Range(0.0, 10.5);

	@Test
	@DisplayName("境界値0.0~10.5:-0.1")
	void test() {
		assertFalse(range.contains(-0.1));
	}

	@Test
	@DisplayName("境界値0.0~10.5:0.0")
	void test2() {
		assertTrue(range.contains(0.0));
	}

	@Test
	@DisplayName("境界値0.0~10.5:10.5")
	void test3() {
		assertTrue(range.contains(10.5));
	}

	@Test
	@DisplayName("境界値0.0~10.5:10.6")
	void test4() {
		assertFalse(range.contains(10.6));
	}

	@Test
	@DisplayName("境界値-5.1~5.1:-5.2")
	void test5() {
		range = new Range(-5.1, 5.1);
		assertFalse(range.contains(-5.2));
	}

}
