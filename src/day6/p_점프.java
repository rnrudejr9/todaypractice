package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//

public class p_점프 {
    static int[][] map;
    static boolean[][] visited;
    static int count  = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        for(int i =0;i<n;i++){
            String[] str = br.readLine().split(" ");
            for(int j =0;j<str.length;j++){
                map[i][j] = Integer.parseInt(str[j]);
            }
        }
        dfs(0,0);
        System.out.println(count);
    }
    public static void dfs(int x,int y){
        if(x >= 0 && x < map.length && y >= 0 && y < map.length) {
                System.out.println("x : " + x);
                System.out.println("y : " + y);
                if (x == map.length - 1 && y == map.length - 1) {
                    count++;
                    return;
                }
                int d = map[x][y];
                if( d == 0){
                    return;
                }
                dfs(x + d, y);
                dfs(x, y + d);
        }
    }
}
