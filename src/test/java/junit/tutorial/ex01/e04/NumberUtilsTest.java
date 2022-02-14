package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberUtilsTest {

	NumberUtils numberUtils = new NumberUtils();

	@Test
	@DisplayName("true")
	void test() {
		assertTrue(numberUtils.isEven(10));
	}

	@Test
	@DisplayName("false")
	void test2() {
		assertFalse(numberUtils.isEven(7));
	}

}
