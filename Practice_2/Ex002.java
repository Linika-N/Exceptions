package Practice_2;

public class Ex002 {
    public static void main(String[] args) {
        try {
            int[] intArray = {15,3,46,548,4,36,7,-5,6};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
    
    }     
}
