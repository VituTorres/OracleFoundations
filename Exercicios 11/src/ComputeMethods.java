import java.util.Random;


public class ComputeMethods {
	public double fToC(double degreesF) {
	return (degreesF - 32) * 5.0 / 9.0;
	}
	
	public double hypotenuse(int a, int b) {
        return Math.sqrt((a * a) + (b * b));
    }
	
	public int roll() {

        Random random = new Random();

        return random.nextInt(6) + 1;
    }
    
}

