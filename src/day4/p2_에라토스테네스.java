package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2_에라토스테네스 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long temp = 10;
        for(int i = 1; i< n;i++){
            temp *= 10;
        }

        boolean[] prime = new boolean[(int) (temp + 1)];
        prime[0] = prime[1] = true;

        for(int i = 2;i*i<=temp;i++){
            if(!prime[i]){
                for(int j=i*i; j<=temp; j+=i) prime[j]=true;
            }
        }

        long start = temp/10;
        while(start != temp){
            if(isSosu(start,n,prime)){
                System.out.println(start);
            }
            start++;
        }
    }

    public static boolean isSosu(long start,int n,boolean[] prime){

        for(int i = 0;i<n;i++){
            if(prime[(int) start]){
                return false;
            }
            start /= 10;
        }
        return true;
    }
}
