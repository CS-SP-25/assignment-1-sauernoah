//The class for Alaska
public class Alaska extends State {
    //Creates an instance of Alaska and assigns it notax
    //salesTaxBehavior;
	public Alaska() {
	}
    public void setTaxBehavior(SalesTaxBehavior s) {
        salesTaxBehavior = s;
    }
    //Shows the tax on the value given,
    //following format “The sales tax on $[SALE] in [STATE] is $[TAX].”
	public void showTax(double value) {
		System.out.printf("The sales tax on $%.2f in %s is $%.2f.\n", value, this.getName(), salesTaxBehavior.compute(value));
        }
}
