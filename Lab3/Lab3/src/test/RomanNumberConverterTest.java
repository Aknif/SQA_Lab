package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.RomanNumberConverter;

class RomanNumberConverterTest {

	RomanNumberConverter rnc;
		
	@BeforeEach
	public void setup() {
		rnc = new RomanNumberConverter();
	}
	
	@Test
	@DisplayName("TS001_TC01 - string = I, expected result = 1")
	void TS001_TC01_RomanNumberConverter() {
		int result = rnc.asArabic("I");
		assertEquals(1, result);
	}
	@Test
	@DisplayName("TS002_TC01 - string = II, expected result = 2")
	void TS002_TC01_RomanNumberConverter() {
		int result = rnc.asArabic("II");
		assertEquals(2, result);
	}
	@Test
	@DisplayName("TS003_TC01 - string = III, expected result = 3")
	void TS002_TC02_RomanNumberConverter() {
		int result = rnc.asArabic("III");
		assertEquals(3, result);
	}
	@Test
	@DisplayName("TS004_TC01 - string = VI, expected result = 6")
	void TS003_TC01_RomanNumberConverter() {
		int result = rnc.asArabic("VI");
		assertEquals(6, result);
	}
	@Test
	@DisplayName("TS005_TC01 - string = VIII, expected result = 8")
	void TS003_TC03_RomanNumberConverter() {
		int result = rnc.asArabic("VIII");
		assertEquals(8, result);
	}
	@Test
	@DisplayName("TS006_TC01 - string = IXI, expected result = Decline")
	void TS004_TC01_RomanNumberConverter() {
		int result = rnc.asArabic("IXI");
		assertEquals("Decline", result);
	}
	@Test
	@DisplayName("TS007_TC01 - string = -I, expected result = Decline")
	void TS007_TC01_RomanNumberConverter() {
		int result = rnc.asArabic("-I");
		assertEquals("Decline", result);
	}

}
