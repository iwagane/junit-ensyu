package junit.tutorial.ex03.e01;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MonthlyCalendarTest {
	
	MonthlyCalendar monthlyCalendar;

	@Test
	@DisplayName("1/31")
	void test() {
		monthlyCalendar=new MonthlyCalendar(LocalDate.of(2012, 1, 31));
		assertEquals(0, monthlyCalendar.getRemainingDays());
	}
	
	@Test
	@DisplayName("1/30")
	void test2() {
		monthlyCalendar=new MonthlyCalendar(LocalDate.of(2012, 1, 30));
		assertEquals(1, monthlyCalendar.getRemainingDays());
	}
	
	@Test
	@DisplayName("2/1")
	void test3() {
		monthlyCalendar=new MonthlyCalendar(LocalDate.of(2012, 2, 1));
		assertEquals(28, monthlyCalendar.getRemainingDays());
	}

}
