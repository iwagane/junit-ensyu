package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator calculator = new Calculator();

	@Test
	@DisplayName("例外送出テスト")
	void test() {
	   assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
	}

}
