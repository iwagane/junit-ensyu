package junit.tutorial.ex02.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ConsumptionTaxTest {
	@ParameterizedTest
	@CsvSource({ "5,100,105", "5,3000,3150", "10,50,55", "5,50,52", "3,50,51" })
	@DisplayName("パラメータ化テスト")

	void test(int rate, int price, int expected) {
		ConsumptionTax consumptionTax = new ConsumptionTax(rate);
		assertEquals(expected, consumptionTax.apply(price));
	}

}
