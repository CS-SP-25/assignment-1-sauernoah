public class SalesTaxCalculator {
    //The main class that runs the code
	public static void main(String args[]) {
        //Takes the name of the state
		String inpt = args[0];
        //The value on which we are calculating sales tax
        Double val = Double.valueOf(args[1]);
        //Creating a new State
        State newState;
        //Assigning the state to be Alaska, Hawaii or Indiana, depending on input
        //creates the state, sets the name and sets the TaxBehavior
        if(inpt.equals("Alaska")) {
            newState = new Alaska();
            newState.setName("Alaska");
            newState.setTaxBehavior(new NoTax());
        } else if(inpt.equals("Hawaii")) {
            newState = new Hawaii();
            newState.setName("Hawaii");
            newState.setTaxBehavior(new fourHalf());
        } else {
            newState = new Indiana();
            newState.setName("Indiana");
            newState.setTaxBehavior(new SevenPercent());
        }
        
        //Calculating and displaying the sales tax on the given value
        newState.showTax(val);
	}
}
