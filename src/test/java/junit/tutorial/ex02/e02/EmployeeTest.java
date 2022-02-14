package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	@DisplayName("JavaBeans")
	void test() {
		Employee employee = new Employee();
		List<Employee> result = employee.load(getClass().getResourceAsStream("Employee.txt"));
		assertEquals("Ichiro", result.get(0).getFirstName());
		assertEquals("Tanaka", result.get(0).getLastName());
		assertEquals("ichiro@example.com", result.get(0).getEmail());
	}

}
