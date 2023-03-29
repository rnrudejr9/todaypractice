package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//DFS

public class Sp_간선의개수 {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> list;
    static int count=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        visited = new boolean[n];
        list = new ArrayList<>();
        for(int i =0 ;i<n;i++) {
            list.add(new ArrayList());
        }
        for(int i = 0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.get(x-1).add(y-1);
            list.get(y-1).add(x-1);
        }
        for(int i =0;i<n;i++) {
            if(!visited[i]) {
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }

    public static void dfs(int t){
        if(visited[t]){
            return;
        }
        if(!visited[t]){
            visited[t] = true;
            for(int i = 0;i<list.get(t).size();i++){
                dfs(list.get(t).get(i));
            }
        }
    }
}
