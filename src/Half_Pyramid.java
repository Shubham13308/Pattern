import java.util.*;
public class Half_Pyramid {
    public static void main(String[] args) {
        int n=4;
        // for outer loop
        for(int i=1;i<=n;i++){
            // for inner loop
            for (int j=1;j<=i;j++){
                // j is dependent on i
                System.out.print("*");
            }

            System.out.println();
        }

    }

}
