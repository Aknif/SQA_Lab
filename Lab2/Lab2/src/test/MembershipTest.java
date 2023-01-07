package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Membership;

class MembershipTest {

	Membership membership;
	
	@BeforeEach
	public void setup() {
		membership = new Membership();
	}
	
	@Test
	@DisplayName("TS001_TC01 - purchase = 20, invitefriend = 20, joinevent = 10, expected result = 50")
	void TS001_TC01_calculatePoint() {
		int result = membership.calculatePoint(20,20,10);
		assertEquals(50, result);
	}
	
	@Test
	@DisplayName("TS001_TC02 - purchase = 40, invitefriend = 40, joinevent = 20, expected result = 100")
	void TS001_TC02_calculatePoint() {
		int result = membership.calculatePoint(40,40,20);
		assertEquals(100, result);
	}
	
	@Test
	@DisplayName("TS001_TC03 - purchase = 0, invitefriend = 0, joinevent = 0, expected result = 0")
	void TS001_TC03_calculatePoint() {
		int result = membership.calculatePoint(0,0,0);
		assertEquals(0, result);
	}
	
	@Test
	@DisplayName("TS001_TC04 - purchase = -1, invitefriend = 20, joinevent = 10, expected result = 29")
	void TS001_TC04_calculatePoint() {
		int result = membership.calculatePoint(-1,20,10);
		assertEquals(29, result);
	}
	
	@Test
	@DisplayName("TS002_TC01 - number = -1, expected result = Invalid")
	void TS002_TC01_checkMembershipStatus() {
		String result = membership.checkMembershipStatus(-1);
		assertEquals("Invalid", result);
	}
	
	@Test
	@DisplayName("TS002_TC02 - number = 0, expected result = Zinc")
	void TS002_TC02_checkMembershipStatus() {
		String result = membership.checkMembershipStatus(0);
		assertEquals("Zinc", result);
	}
	
	@Test
	@DisplayName("TS002_TC03 - number = 1, expected result = Zinc")
	void TS002_TC03_checkMembershipStatus() {
		String result = membership.checkMembershipStatus(1);
		assertEquals("Zinc", result);
	}
	
	@Test
	@DisplayName("TS002_TC04 - number = 101, expected result = Platinum")
	void TS002_TC04_checkMembershipStatus() {
		String result = membership.checkMembershipStatus(101);
		assertEquals("Platinum", result);
	}
}
