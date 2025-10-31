public class ShoppingCart {

    public static void main(String[] args) {

        String custName = "Maria Souza"; 
        

        int spaceIdx = custName.indexOf(" ");


        String firstName = custName.substring(0, spaceIdx);


        System.out.println(firstName); 
    }
}