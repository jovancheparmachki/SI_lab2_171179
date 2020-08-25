import java.util.ArrayList;
import java.util.List;

public class SILab2 {
    static boolean checkPrime(int n) { //1
        if (n < 0) { //2
            throw new RuntimeException("Number should not be negative"); //3
        }
        int m = n / 2; //4
        if (n == 0 || n == 1) { //5
            return false; //6
        } else {
            for (int i = 2; i <= m; i++) { //7.1, 7.2, 7.3
                if (n % i == 0) { //8
                    return true; //9
                }
            }
            return false; //10
        }
    } //11
}