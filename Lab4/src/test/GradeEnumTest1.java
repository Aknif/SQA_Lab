package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class GradeEnumTest1 {

	GradeEnumEdit gradeenum;
	
	@BeforeEach
	void setup() {
		gradeenum = new GradeEnumEdit();
	}
	
	@DisplayName("TS001_TC01_score_sectionA = 0 ,score_sectionB = 50, score_final = 50, Expected result = F")
	@Test
	void TS001_TC01()
	{
		gradeenum = new GradeEnumEdit(0,50,50);
		String result = gradeenum.showResult(gradeenum.classify());
		assertEquals("Fail",result);
	}
	
	@DisplayName("TS002_TC02_score_sectionA = 0 ,score_sectionB = 50, score_final = 50, Expected result = F")
	@Test
	void TS002_TC02()
	{
		gradeenum = new GradeEnumEdit(0,50,50);
		String result = gradeenum.showResult(gradeenum.classify());
		assertEquals("Fail",result);
	}
		
}
