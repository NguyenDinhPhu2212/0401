package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidateBikesNumberTest {

	private StationInfoController stationInfoController;
	
	@BeforeEach
	void setUp() throws Exception {
		stationInfoController =  new StationInfoController();
	}

	@ParameterizedTest
    @CsvSource({
            "33,true",
            "44,true",
            "%Hoa,false",
            "H62a,false",
            "H()a,false"
    })
	void test(String number, boolean expected) {
		boolean isValid = stationInfoController.validateNumber(number);
		Assertions.assertEquals(isValid, expected);
	}

}
