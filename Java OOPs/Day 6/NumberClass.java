import java.text.*;
import java.time.LocalTime;
public class NumberClass {
    public static void main(String[] args) {
        long num=1235555;
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US).format(num);
    }
}
 