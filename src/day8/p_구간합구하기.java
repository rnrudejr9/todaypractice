package day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_구간합구하기 {

    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1 ,0};
    static int[] dy = {0 ,1};
    static int sum =0;
    static int originx;
    static int originy;
    static int endx;
    static int endy;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        map = new int[n][n];
        for(int i =0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0;j<n;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i =0;i<m;i++){
            visited = new boolean[n][n];
            st = new StringTokenizer(br.readLine());
            sum = 0;
            originx = Integer.parseInt(st.nextToken())-1;
            originy = Integer.parseInt(st.nextToken())-1;
            endx = Integer.parseInt(st.nextToken())-1;
            endy = Integer.parseInt(st.nextToken())-1;

            dfs(originx,originy);
            System.out.println(sum);
        }
    }
    public static void dfs(int x,int y){
        if(!(x < originx || x > endx || y < originy || y > endy)) {
            if (!visited[x][y]) {
                visited[x][y] = true;
                sum += map[x][y];
                for (int i = 0; i < 2; i++) {
                    dfs(x + dx[i], y + dy[i]);
                }
            }
        }
    }
}

