package day4;

import java.util.Scanner;

public class p1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int n = sc.nextInt();
            sc.nextLine();
            long[] arr = new long[n+1];
            if(n == 0 || n == 1){
                System.out.println(1);
                T--;
                continue;
            }
            else if(n==2){
                System.out.println(2);
                T--;
                continue;
            }
            else  if(n==3){
                System.out.println(4);
                T--;
                continue;
            }
            arr[0] = 1;
            arr[1] = 1;
            arr[2] = 2;
            arr[3] = 4;
            for(int i = 4;i<=n;i++){
                arr[i] = arr[i-1]+arr[i-2]+arr[i-3]+arr[i-4];
            }
            System.out.println(arr[n]);
            T--;
        }
    }
}
