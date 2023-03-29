package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p3_평범한배낭 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] init = br.readLine().split(" ");
        int n = Integer.parseInt(init[0]);
        int K = Integer.parseInt(init[1]);


        int[] W = new int [n];
        int[] V = new int [n];
        for(int i= 0;i<n;i++){
            String[] temp = br.readLine().split(" ");
            W[i] = Integer.parseInt(temp[0]);
            V[i] = Integer.parseInt(temp[1]);
        }


        for(int i =0;i<n;i++){
            int sum = 0;
            int weight = 0;
            for(int j = i;j<n;j++){
                callback(K,sum,W[j],V[j],weight);
            }
        }
        //전체 탐색을 어떻게 할것인가?
        //브루트포스로 해서 해결
    }

    public static void callback(int K,int sum,int W, int V,int weight){
        if(K < weight + W){
        }else{
            weight += W;
            sum += V;
        }

    }
}
