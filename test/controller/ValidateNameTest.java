package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidateNameTest {

	private StationInfoController stationInfoController;
	
	@BeforeEach
	void setUp() throws Exception {
		stationInfoController =  new StationInfoController();
	}

	@ParameterizedTest
    @CsvSource({
            "Hoang,true",
            "Viet Manh,true",
            "%Hoa,false",
            "H62a,false",
            "H()a,false"
    })
	void test(String name, boolean expected) {
		boolean isValid = stationInfoController.validateStationName(name);
		Assertions.assertEquals(isValid, expected);
	}

}
