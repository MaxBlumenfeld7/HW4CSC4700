import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class CurrencyConverterTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testConvert() {
		CurrencyConverter converter = new CurrencyConverter();
		BigDecimal originalAmount = BigDecimal.valueOf(100.00);
	    BigDecimal conversionRate = BigDecimal.valueOf(2.70);
	    BigDecimal expectedResult = BigDecimal.valueOf(270.00).setScale(CurrencyConverter.DECIMAL_DIGITS);
	    BigDecimal actualResult = converter.convert(originalAmount, conversionRate);
	    assertEquals(expectedResult, actualResult);
	}

}
