import java.util.*;
public class Square {
    public static void main(String[] args) {

        int n = 4;
        int m = 5;
        // for outer loop
        for (int i = 0; i <= n; i++) {
            // for inner loop
            for (int j = 0; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
