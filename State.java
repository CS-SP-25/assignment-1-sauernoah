// This is the class that holds the state behavior, it has a private string name and public methods getName, setName and show tax
public abstract class State {
    SalesTaxBehavior salesTaxBehavior;
    
    public State() {}
    //Stores the state's name
	private String name;
    //Returns the name of the state
    //void -> String
	public String getName() {
		return this.name;
	}
    //Sets the name of the state to the given string
    //String -> void
	public void setName(String name) {
		this.name = name;
	}
    //Shows the tax on the given value
    //double -> void (print line)
	public void showTax(double value) {}
    //sets the salesTaxBehavior
    public void setTaxBehavior(SalesTaxBehavior s) {
        this.salesTaxBehavior = s;
    }
}
