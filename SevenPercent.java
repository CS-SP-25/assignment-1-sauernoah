//The interface for states with 7% sales tax
public class SevenPercent implements SalesTaxBehavior {
	public double compute(double value) {
		return value * .07;
	}
}
