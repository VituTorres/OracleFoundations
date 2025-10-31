public class CalculatorTest4 {
    public static void main(String[] args) {
        
        Calculator4 calc = new Calculator4();
        
        
        //Name your friends

        double p1_total = calc.findTotal(10);
        double p2_total = calc.findTotal(12);
        double p3_total = calc.findTotal(9);
        double p4_total = calc.findTotal(8);
        double p5_total = calc.findTotal(7);
        double alex_total = calc.findTotal(15);
        double p7_total = calc.findTotal(11);
        double forgetful_total = calc.findTotal(30);
        
        double totalDaMesa =p1_total + p2_total + p3_total + p4_total +
                p5_total + alex_total + p7_total + forgetful_total;  
        System.out.printf("o total da mesa inteira é $%.2f%n",totalDaMesa);
        
        double custoNaoPago = alex_total + forgetful_total;
        
        int numeroDePagantes = 6;
        
        double custoExtraPorPessoa = custoNaoPago / numeroDePagantes;
        
        System.out.println("Convidado 1 : $" +  (p1_total + custoExtraPorPessoa));
        System.out.println("Convidado 2 : $" +  (p2_total + custoExtraPorPessoa));
        System.out.println("Convidado 3 : $" +  (p3_total + custoExtraPorPessoa));
        System.out.println("Convidado 4 : $" +  (p4_total + custoExtraPorPessoa));
        System.out.println("Convidado 5 : $" +  (p5_total + custoExtraPorPessoa));
        System.out.println("Convidado 7 : $" +  (p7_total + custoExtraPorPessoa));
        
        	totalDaMesa = (p1_total + custoExtraPorPessoa) * 1 +
                (p2_total + custoExtraPorPessoa) * 1 +
                (p3_total + custoExtraPorPessoa) * 1 +
                (p4_total + custoExtraPorPessoa) * 1 +
                (p5_total + custoExtraPorPessoa) * 1 +
                (p7_total + custoExtraPorPessoa) * 1;
        	System.out.println("Total Pago pelos 6 Convidados: $" + String.format("%.2f", totalDaMesa));

        //Find and print the entire table's total, including tax and tip
       
    } 
}
