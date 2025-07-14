package introToObjectOriantedProgramming;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	BigDecimal principle;
	BigDecimal interest;

	SimpleInterestCalculator(String principle, String interest) {
		this.principle = new BigDecimal(principle);
		this.interest = new BigDecimal(interest);
	}

	BigDecimal calculateTotalValue(int years) {

		BigDecimal numberOfYears = new BigDecimal(years);

		BigDecimal result = principle.add(principle.multiply(interest).multiply(numberOfYears));

		return result;

	}

};