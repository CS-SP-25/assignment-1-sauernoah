//The class for the states that have no sales tax
public class NoTax implements SalesTaxBehavior {
	//As there is no sales tax, the value returned is $0.00
    public double compute(double value) {
		return 0;
	}
}
