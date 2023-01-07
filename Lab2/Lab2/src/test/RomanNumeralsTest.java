package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class RomanNumeralsTest {

	RomanNumerals romannumerals;
	
	@BeforeEach
	public void setup() {
		romannumerals = new RomanNumerals();
	}
	
	@Test
	@DisplayName("TC01 - string = I, expected result = 1")
	void TC01_convertRomanNumToInt() {
		int result = romannumerals.convertRomanNumToInt("I");
		assertEquals(1, result);
	}
	
	@Test
	@DisplayName("TC02 - string = II, expected result = 2")
	void TC02_convertRomanNumToInt() {
		int result = romannumerals.convertRomanNumToInt("II");
		assertEquals(2, result);
	}
	
	@Test
	@DisplayName("TC03 - string = III, expected result = 3")
	void TC03_convertRomanNumToInt() {
		int result = romannumerals.convertRomanNumToInt("III");
		assertEquals(3, result);
	}
	
	@Test
	@DisplayName("TC04 - string = VI, expected result = 6")
	void TC04_convertRomanNumToInt() {
		int result = romannumerals.convertRomanNumToInt("VI");
		assertEquals(6, result);
	}
	
	@Test
	@DisplayName("TC05 - string = VIII, expected result = 8")
	void TC05_convertRomanNumToInt() {
		int result = romannumerals.convertRomanNumToInt("VIII");
		assertEquals(8, result);
	}
	
	@Test
	@DisplayName("TC06 - string = VIII, expected result = 8")
	void TC06_convertRomanNumToInt() {
		int result = romannumerals.convertRomanNumToInt("IXI");
		assertEquals("no answer", result);
	}

}
