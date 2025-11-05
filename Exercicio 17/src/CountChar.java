public class CountChar {

    public static void main(String[] args) {

        String str = "www.oracle.com";

        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == 'w') {
               count ++;
            }
        
        System.out.println("Counting w : " + count );
    }
}
    

