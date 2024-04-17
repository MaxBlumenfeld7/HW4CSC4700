import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyConverter {

    protected static final int DECIMAL_DIGITS = 2;

	public CurrencyConverter() {
		
	}//construct
	
	public BigDecimal convert(BigDecimal originalAmount, BigDecimal conversionRate) {
		BigDecimal convertedAmount = originalAmount.multiply(conversionRate);
	    return convertedAmount.setScale(DECIMAL_DIGITS, RoundingMode.HALF_UP);
		
	}//convert
	boolean isValidRate(BigDecimal rate) {
		return (rate.compareTo(BigDecimal.valueOf(0)) > 0 && rate.compareTo(BigDecimal.valueOf(100000)) < 0);
	}
}