public class fourHalf implements SalesTaxBehavior {
	//Sales tax value is 4.5% of value
    public double compute(double value) {
		return .045 * value;
	}
}