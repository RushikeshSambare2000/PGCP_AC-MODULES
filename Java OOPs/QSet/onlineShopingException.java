import java.util.*;
public class onlineShopingException {

    public static void processOrder(int quantity, double[] prices, int index) {
        try {
            // Arithmetic Exception (divide by zero simulation)
            if (quantity == 0) {
                int x = 10 / quantity;   // triggers ArithmeticException
            }

            // Array Index Exception
            double unitPrice = prices[index];  // may throw ArrayIndexOutOfBoundsException

            double total = quantity * unitPrice;
            System.out.println("Total Price = " + total);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Qty : ");
        int quantity = sc.nextInt();   // e.g. 0
        System.out.println("Enter Array size");
        int n = sc.nextInt();          // e.g. 3

        double[] prices = new double[n];
        System.out.println("enter array element");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextDouble();
        }

        int index = sc.nextInt();      // e.g. 5

        processOrder(quantity, prices, index);
    }
}
    
