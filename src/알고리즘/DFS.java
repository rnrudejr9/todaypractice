package 알고리즘;

// 0은 길 1은 막힌길
// 0,0 좌표는 0 n,n 좌표는 도착지 까지의 거리 구하기
// 움직임 경로 출력

//좌표값 저장하는 자료구조

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Node{
    int x;
    int y;
    int depth;
    Node(int x,int y, int depth){
        this.x = x;
        this.y = y;
        this.depth = depth;
    }
}

public class DFS {
    static int[][] map;
    static int[] dx = {0, 1};
    static int[] dy = {1, 0};
    static boolean[][] visited;
    static ArrayList<Node> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        input();
        DFS(0,0,0);
    }
    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        map = new int[n][n];
        visited = new boolean[n][n]; // all false

        for(int i = 0; i < n;i++){
            String[] str = br.readLine().split(" ");
            for(int j=0;j<str.length;j++){
                map[i][j] = Integer.parseInt(str[j]);
            }
        }
    }

    public static void DFS(int x,int y,int depth){
        list.add(new Node(x,y,depth));

        if(map[x][y] == 1){
            list.remove(new Node(x,y,depth));
            return;
        }

        if(x == map.length-1 && y == map.length-1){
            for(Node n : list){
                System.out.println("x : "+ n.x + " y : " + n.y + " depth : " + n.depth);
            }
            return;
        }
        visited[x][y] = true;
        for(int i = 0;i<dx.length;i++){
            int mx = x + dx[i];
            int my = y + dy[i];
            if(mx >= 0 && mx < map.length && my >= 0 && my < map.length) {
                if (!visited[mx][my]) {
                    DFS(mx, my, depth++);
                }
            }
        }

    }
}
