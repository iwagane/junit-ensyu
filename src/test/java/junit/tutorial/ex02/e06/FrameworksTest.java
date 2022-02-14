package junit.tutorial.ex02.e06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FrameworksTest {

	Frameworks frameworks = new Frameworks();

	@Test
	@DisplayName("GlassFish-Oracle")
	void test() {
		assertTrue(frameworks.isSupport(ApplicationServer.GlassFish, Database.Oracle));
	}

	@Test
	@DisplayName("GlassFish-DB2")
	void test2() {
		assertTrue(frameworks.isSupport(ApplicationServer.GlassFish, Database.DB2));
	}

	@Test
	@DisplayName("GlassFish-PostgreSQL")
	void test3() {
		assertTrue(frameworks.isSupport(ApplicationServer.GlassFish, Database.PostgreSQL));
	}

	@Test
	@DisplayName("GlassFish-MySQL")
	void test4() {
		assertTrue(frameworks.isSupport(ApplicationServer.GlassFish, Database.MySQL));
	}

	@Test
	@DisplayName("Tomcat-MySQL")
	void test5() {
		assertTrue(frameworks.isSupport(ApplicationServer.Tomcat, Database.MySQL));
	}

	@Test
	@DisplayName("JBoss-DB2")
	void test6() {
		assertTrue(frameworks.isSupport(ApplicationServer.JBoss, Database.DB2));
	}

	@Test
	@DisplayName("JBoss-PostgreSQL")
	void test7() {
		assertTrue(frameworks.isSupport(ApplicationServer.JBoss, Database.PostgreSQL));
	}

}
