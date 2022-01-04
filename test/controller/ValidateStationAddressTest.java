package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidateStationAddressTest {

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
	void test(String location, boolean expected) {
		boolean isValid = stationInfoController.validateAddress(location);
		Assertions.assertEquals(isValid, expected);
	}

}
