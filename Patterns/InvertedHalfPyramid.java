package Patterns;
/*
 *****
 ****
 ***
 **
 *
 this is me
 */

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int row = 5;
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
