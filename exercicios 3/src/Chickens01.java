public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
    	//caso 1
    	int chickenCount =3;
    	int eggsPerChicken =5;
    	int totalEggs =0;
    	
    	totalEggs += chickenCount * eggsPerChicken;
    	
    	chickenCount += 1;
    	
    	totalEggs += chickenCount * eggsPerChicken;
    	
    	chickenCount /=2 ;
    	
    	totalEggs += chickenCount * eggsPerChicken;
    	
    	System.out.println("Total de ovos coletados (caso 1): " + totalEggs);
    	
    	 // Caso 2
        eggsPerChicken = 4;
        chickenCount = 8;
        totalEggs = 0;

        totalEggs += chickenCount * eggsPerChicken;

        chickenCount += 1;
        totalEggs += chickenCount * eggsPerChicken;

        chickenCount /= 2;
        
        totalEggs += chickenCount * eggsPerChicken;	 
        System.out.println("total de ovos coletados (caso 2) " + totalEggs);
    }   
}
