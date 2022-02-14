package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

	StringUtils stringUtils = new StringUtils();

	@Test
	@DisplayName("aaa取得")
	void test1() {
		assertEquals("aaa", stringUtils.toSnakeCase("aaa"));
	}

	@Test
	@DisplayName("hello_world取得")
	void test2() {
		assertEquals("hello_world", stringUtils.toSnakeCase("HelloWorld"));
	}

	@Test
	@DisplayName("practice_junit取得")
	void test3() {
		assertEquals("practice_junit", stringUtils.toSnakeCase("practiceJunit"));
	}
}