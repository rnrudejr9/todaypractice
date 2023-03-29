package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//map 받은 뒤에
//bfs 를 하여 구역별 방문처리 후 bfs 시도 한 횟수 출력
public class p_유기농뱇푸 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T>0) {
            String[] str = br.readLine().split(" ");
            int m = Integer.parseInt(str[0]);
            int n = Integer.parseInt(str[1]);
            int k = Integer.parseInt(str[2]);

            int[][] map = new int[m][n];
            for(int i =0;i<k;i++){


            }
            T--;
        }


    }
}
