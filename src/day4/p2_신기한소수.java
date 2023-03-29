package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;

public class p2_신기한소수 {

    static boolean[] prime;
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            long temp = 10;
            for(int i = 1; i< n;i++){
                temp *= 10;
            }
            long start = temp/10;

            prime = new boolean[(int)temp + 1];
            while(start != temp){
                if(isSosu(start,n)){
                    System.out.println(start);
                }
                start++;
            }
        }


        public static boolean isSosu(long start,int n){
            for(int i = 0;i<n;i++){
                if( start < 2){
                    return false;
                }
                if(start == 2){
                    continue;
                }
                for(int j = 2; j<= Math.sqrt(start);j++){
                    if(start % j == 0){
                        return false;
                    }
                }
                start /= 10;
            }
            return true;
        }



}
