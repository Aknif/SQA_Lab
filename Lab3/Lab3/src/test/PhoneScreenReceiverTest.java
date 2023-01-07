package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import test.PhoneScreenReceiverEdit;

class PhoneScreenReceiverTest {

	PhoneScreenReceiverEdit phonescreenreceiver;
	
	@BeforeEach
	public void setup() {
		phonescreenreceiver = new PhoneScreenReceiverEdit();
	}
	void beforeEach(TestInfo testInfo, RepetitionInfo repetitionInfo) {
	 	int currentRepetition = repetitionInfo.getCurrentRepetition();
        int totalRepetitions = repetitionInfo.getTotalRepetitions();
        String methodName = testInfo.getTestMethod().get().getName();
        System.out.println(methodName + ":" + currentRepetition + "/" +totalRepetitions);
	}
	
	@RepeatedTest(5)
	@DisplayName("TS001_TC01 - isCorrectPwd = false , expected result = false")
	void TS001_TC01_repeatedtest(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		int currentRepetition = repetitionInfo.getCurrentRepetition();
		int totalRepetitions = repetitionInfo.getTotalRepetitions();
		
		boolean input = false;
		phonescreenreceiver.onReceive(currentRepetition,input);
		boolean result = phonescreenreceiver.isScreenOn;
		
		System.out.println("noAttemp = " + currentRepetition + 
				" and isCorrectPwd = " + input + ", Expected result = false, Actual result = " + result);	
		assertEquals(false,result);
	}
	
	@RepeatedTest(5)
	@DisplayName("TS002_TC01 - isCorrectPwd = true , expected result = true")
	void TS002_TC01_repeatedtest(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		int currentRepetition = repetitionInfo.getCurrentRepetition();
		int totalRepetitions = repetitionInfo.getTotalRepetitions();
		
		boolean input = true;
		phonescreenreceiver.onReceive(currentRepetition,input);
		boolean result = phonescreenreceiver.isScreenOn;
		
		System.out.println("noAttemp = " + currentRepetition + 
				" and isCorrectPwd = " + input + ", Expected result = true, Actual result = " + result);
		assertEquals(true,result);
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("Tested by 633020429-7\n");
	}
	
	

}
