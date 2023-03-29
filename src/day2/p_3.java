package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class p_3 {
    static int[][] map;
    static int[] dx = {2,1,-1,-2,-2,-1, 1, 2};
    static int[] dy = {1,2, 2, 1,-1,-2,-2,-1};
    static boolean[][] visited;
    static int goalX;
    static int goalY;
    static Queue<int[]> q = new LinkedList<int[]>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T>0) {
            int n = Integer.parseInt(br.readLine());
            map = new int[n][n];
            visited = new boolean[n][n];
            String[] xy = br.readLine().split(" ");
            String[] goalxy = br.readLine().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            goalX = Integer.parseInt(goalxy[0]);
            goalY = Integer.parseInt(goalxy[1]);


            bfs(x,y,0);

            T--;
        }
    }
    public static void bfs(int x, int y, int count){
            q.offer(new int[]{x, y});
            while (!q.isEmpty()) {
                    int[] xy = q.poll();
                    int tempX = xy[0];
                    int tempY = xy[1];
                    System.out.println("tempX : " + tempX);
                    System.out.println("tempY : " + tempY);

                    if (tempX == goalX && tempY == goalY) {
                        System.out.println(count);
                        q.clear();
                        return;
                    }
                    for (int i = 0; i < dx.length; i++) {
                        visited[tempX][tempY] = true;
                        int nx = tempX + dx[i];
                        int ny = tempY + dy[i];
                        if (nx >= 0 && nx < map.length && ny >= 0 && ny < map.length) {
                            if (!visited[nx][ny]) {
                                q.offer(new int[]{nx, ny});
                            }
                        }
                    }
            }
    }
}
