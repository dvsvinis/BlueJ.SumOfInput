/**
 * Created by Donna Svinis on 05/22/2019
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n;
        int total = 0;
        
        System.out.println("Input a whole number.");
        n = in.nextInt(); 
        for (int i = 1; i <= n; i++) {
            total = total + i;
        }
        System.out.println("The sum of the numbers 1 to " + n + " is: " + total);
    }
}
