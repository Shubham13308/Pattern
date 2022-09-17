import java.util.*;
public class Inverted_HalfPyramid {
    public static void main(String[] args) {
        int n=4;
        // for outer loop to print in decreasing order
        for(int i=n;i>=1;i--){
            // for inner loop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
