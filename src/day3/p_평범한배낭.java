package day3;

import java.util.Scanner;

public class p_평범한배낭 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int max = -1;
        int value = 0;
        for(int i = 1;i<k;i++) {
            int count = 0;
            int n = i;
            while (true) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = (n * 3) + 1;
                }
                count++;
                if (n == 1) {
                    break;
                }
            }
            if(max < count){
                max = count;
                value = i;
            }
        }

        System.out.println("max "+ max);
        System.out.println("value "+value);

    }
}
