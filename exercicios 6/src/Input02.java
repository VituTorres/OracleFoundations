import javax.swing.JOptionPane;

public class Input02 {
    @SuppressWarnings("unused")
	public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "não tem nada pra escrever aqui só uma mensagem",
                "Message",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "isso é uma pergunta?",
                "dialogo",
                3,
                null,
                null,
                "escreva algo aqui.");
        
        
        String[] acceptableValues = {"sim", "não", "Talvez"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "isso é uma questÃo?",
                "Escolha",
                3,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
}
