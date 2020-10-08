 /**
* File Name : Automobile.java
* Author    : Kwame Duodu
* Date      : June 14, 2020 
* Purpose   : A program that computes the sales tax for a collection of automobiles of different types. 
*/ 
class Automobile {
	//variable 
String makeAndModel;
double purchasePrice;


//constructor
public Automobile (String makeAndModel, double purchasePrice) {
	this.makeAndModel = makeAndModel;
	this.purchasePrice = purchasePrice;		
	
}
	
//saleTax method returns the base sales tax
public double salesTax() {
	return purchasePrice * .05;
}

@Override
public String toString() {
		return String.format("\nMake and Model : %s\n" + "Sales Price : %.2f\n"
           + "Sales Tax : %.2f\n",makeAndModel,purchasePrice,salesTax());
	}

}

