 /**
* File Name : Hybrid.java
* Author    : Kwame Duodu
* Date      : June 14, 2020 
* Purpose   : A program that computes the sales tax for a collection of automobiles of different types. 
*/ 
public class Hybrid extends Automobile {
	private Integer milesPerGallon;

	// parameterized constructor  
			public Hybrid(String makeAndModel, double purchasePrice, Integer milesPerGallon) {
				super(makeAndModel, purchasePrice);
				this.milesPerGallon = milesPerGallon;
			}
			
	//overridden method that returns the total sales tax for an electric automobile.
			@Override
			public double salesTax() {
				double salesTaxPrice = super.salesTax();
				if(milesPerGallon < 40) {     
						return salesTaxPrice - 100;
						
					}else {
					Integer discount = (this.milesPerGallon - 40) * 2;             
							return salesTaxPrice - discount - 100;
						}
					}

	// Overridden toString method that return a string containing the make and the model of the automobile, sales price, sales tax, and weight  
	  		 @Override
	   		 public String toString() {
	       			return String.format("\nMake and Model : %s\n" + "Sales Price : %.2f\n" + "Sales Tax : %.2f\n" + "Hybrid Vehicle"
	              		 + "MPG : %d\n",makeAndModel,purchasePrice,salesTax(),milesPerGallon);
	   			}
	  
	}
