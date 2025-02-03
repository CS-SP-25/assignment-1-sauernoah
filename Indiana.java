//The class Indiana that has seven percent sales tax
public class Indiana extends State {
	public Indiana() {
        salesTaxBehavior = new SevenPercent();
	}
    //Shows the tax on the value given,
    //following format “The sales tax on $[SALE] in [STATE] is $[TAX].”
	public void showTax(double value) {
		System.out.printf("The sales tax on $%.2f in %s is $%.2f.\n", value, this.getName(), salesTaxBehavior.compute(value));
	}
}
