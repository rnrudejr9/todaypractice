package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 회차별로 다루는데
// 1회차 1인 값들이 있다면 주변에 1씩 전파
// 전파는 뎁스를 구현해서 끝까지 조사
// 전체 검사했는데 0 이 존재하면 안ㄷ만들어지는거

public class p4_멋쟁이토마토 {
    static int[] dx = {0,1,-1,0};
    static int[] dy = {1,0,0,-1};
    static int[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] init = br.readLine().split(" ");
        int n = Integer.parseInt(init[0]);
        int m = Integer.parseInt(init[1]);
        map = new int[n][m];
        for(int i =0;i<m;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j =0;j<n;j++){
                map[j][i] = Integer.parseInt(st.nextToken());
            }
        }
        tomato(0,0);
    }

    public static void tomato(int x, int y){
        if(map[x][y] == 0){
            for(int i=0;i<dx.length;i++){
                int mx = x + dx[i];
                int my = y + dy[i];
                if(mx >= 0 && mx < map.length && my >= 0 && my < map[0].length){
                        tomato(mx,my);
                }
            }
        }
        if(map[x][y] == 1){
            for(int i=0;i<dx.length;i++){
                int mx = x + dx[i];
                int my = y + dy[i];
                if(mx >= 0 && mx < map.length && my >= 0 && my < map[0].length){
                    if(map[mx][my] == 0){
                        map[mx][my] = 1;
                        tomato(mx,my);
                    }
                }
            }
        }
    }
}
