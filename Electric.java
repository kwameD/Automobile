 /**
* File Name : Electric.java
* Author    : Kwame Duodu
* Date      : June 14, 2020 
* Purpose   : A program that computes the sales tax for a collection of automobiles of different types. 
*/ 
public class Electric extends Automobile {
	private Integer weightInPounds;
	
	//constructor
	public Electric(String makeAndModel,double purchasePrice,  Integer weightInPounds) {
		super (makeAndModel, purchasePrice);
		this.weightInPounds = weightInPounds;
	}
	
	//overridden method salesTax that returns the total sales tax
	@Override
	public double salesTax(){
		double salesTaxPrice = super.salesTax();
		if(weightInPounds < 3000) {           
				return salesTaxPrice - 200;
				
			} else {          
				return salesTaxPrice - 150;
			}
				
	}


// Overridden toString method that return a string containing the make and the model of the automobile, sales price, sales tax, and weight
	@Override
	public String toString() {
		return String.format("\nMake and Model : %s\n"+ "Sales Price : %.2f\n" + "Sales Tax : %.2f\n"+ "Weight : %d\n"
		+ "Electric Vehicle",makeAndModel,purchasePrice, salesTax(),weightInPounds);
		}
  
	}
	
