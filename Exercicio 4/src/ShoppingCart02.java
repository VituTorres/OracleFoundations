public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "camisas";
        String message = custName+" quer comprar uma "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.  
        double preco,imposto;
        int quantidade;
        quantidade=2;
        preco=12.0;
        imposto=0.89;   
        
        // Declare and assign a calculated totalPrice
        double totalPrice;
        totalPrice = (preco+imposto)*quantidade;
       
        // Modify message to include quantity 
        message = custName+" quer comprar " +quantidade +" "+itemDesc;
        System.out.println(message);
        
        // Print another message with the total cost
        System.out.println("o custo total com o imposto é " + totalPrice);
               
    }    
}
