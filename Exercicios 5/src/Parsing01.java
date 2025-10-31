public class Parsing01 {
	public static void main(String[] args) {
        
    	//Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
    	String shirtPrice = "15";
    	String taxRate = "0.05";
    	String gibberish = "887ds7nds87dsfs";

        
        
        
        
        //Parse shirtPrice and taxRate, and print the total tax
    	int intShirt =Integer.parseInt(shirtPrice);
    	Double doubletaxRate = Double.parseDouble(taxRate);
    	
    	double totalTax = intShirt * doubletaxRate;
    	
    	System.out.println("total tax = " + totalTax );
    	
        
        
        
        //Try to parse taxRate as an int
    	int intRate =Integer.parseInt(taxRate);
    	System.out.println(intRate);
        
        //Try to parse gibberish as an int
    	int intGib = Integer.parseInt(gibberish);      
    	System.out.println(intGib);
    }
    
}
