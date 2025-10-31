public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "camisas";
        String message = custName+" quer comprar uma "+itemDesc;
        

        double preco,imposto;
        int quantidade;
        quantidade=2;
        preco=12.0;
        imposto=0.89;   
        
        if (quantidade >1) {
        	message = custName + " quer comprar " + quantidade + " " + itemDesc + "s."; 
        }else {
        	message = custName + " quer comprar " + quantidade + " " + itemDesc + ".";
        
        }
        
        double totalPrice;
        totalPrice = (preco+imposto)*quantidade;
       

        message = custName+" quer comprar " +quantidade +" "+itemDesc;
        System.out.println(message);
        

        System.out.println("o custo total com o imposto é " + totalPrice);
        boolean outOfStock = false;
        
        if (outOfStock) { 
            System.out.println("O item '" + itemDesc + "' não está disponível.");
        } else {
        	
        }

        
               
    }    
}
