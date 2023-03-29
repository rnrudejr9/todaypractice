package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_1 {
    static int[] arr;
    static int[] prex = new int[4];
    static int[] now;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        now = new int[4];
        visited = new boolean[4];
        String[] temp = br.readLine().split(" ");
        for(int i =0;i<n;i++){
            arr[i] = Integer.parseInt(temp[i]);
        }

        temp = br.readLine().split(" ");
        for(int i = 0;i<4;i++){
            prex[i] = Integer.parseInt(temp[i]);
        }




    }

    public static void dfs(int depth){

        now[depth] = prex[depth];

    }


}
