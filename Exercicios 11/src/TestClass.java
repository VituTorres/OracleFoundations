public class TestClass {

    public static void main(String args[]) {
        
        //Create an instance of ComputeMethods, 
    	ComputeMethods computer = new ComputeMethods();
        //invoke the 3 methods and dispay their results
    	double tempF=32.0;
    	System.out.println(tempF+"°F equivale a" + computer.fToC(tempF) + "°C.");
    	
    	int a = 3;
        int b = 4;
        System.out.println("A hipotenusa de um triângulo com lados " 
        					+ a + " e " + b + " é " + 
        					computer.hypotenuse(a, b) + ".");
        
        System.out.println("Resultado do primeiro lançamento do dado: " + computer.roll());
        System.out.println("Resultado do segundo lançamento do dado: " + computer.roll());
        
    	
    }
}
