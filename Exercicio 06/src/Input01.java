import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
    	String input =(String) JOptionPane.showInputDialog(null,"pergunta","titulo",2,null,null,"digite algo");
    	System.out.println(input);
    	
        
        
        
        //Parse the input as an int.
        //Print its value +1
        int intInput =Integer.parseInt(input);
        intInput++;
        System.out.println("O valor + 1 é: " + intInput);
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        int input2 = Integer.parseInt(JOptionPane.showInputDialog("??")) +1;
    	System.out.println(input2);
        
        //You should have only one semicolon (;) in this line.

        
    }
}
