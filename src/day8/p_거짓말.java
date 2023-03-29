package day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

// 교집합이 있을 경우 합집합을 하여 최종적으로 비교해서 교집합이 없는 수만큼 카운팅
// DFS 구현


public class p_거짓말 {
    static int N;
    static int M;
    static int K;
    static boolean[] visited;
    static HashSet<Integer>[] set;
    // 몇명인지
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());

        HashSet<Integer> originSet = new HashSet<>();

            for (int i = 0; i < K; i++) {
                originSet.add(Integer.parseInt(st.nextToken()));
            }

        set = new HashSet[M];
            visited = new boolean[M];
            for(int i = 0 ;i<M;i++){
                set[i] = new HashSet<>();
            }
        for(int i = 0;i<M;i++){

            set[i] = new HashSet<>();
            st = new StringTokenizer(br.readLine());
            int temp = Integer.parseInt(st.nextToken());
            for(int j = 0;j<temp;j++){
                set[i].add(Integer.parseInt(st.nextToken()));
            }

//            System.out.println("origin set : "+ originSet.toString());
//            System.out.println("set : "+ set[i].toString());


            kyo(originSet,i);
        }
        int count = 0;
        for(int i = 0;i<M;i++){

//            System.out.println("origin set : "+ originSet.toString());
//            System.out.println("set : "+ set[i].toString());



            HashSet<Integer> setTemp = new HashSet<>(originSet);
            if(!setTemp.containsAll(set[i])){
//                System.out.println("count ++");
                count++;
            }
        }


        System.out.println(count);

    }
    static void kyo(HashSet<Integer> originSet,int idx){
        if(!visited[idx]) {
            Iterator<Integer> it = originSet.iterator();
            while (it.hasNext()) {
                Integer temp = it.next();
                if (set[idx].contains(temp)) {
                    originSet.addAll(set[idx]);
                }
            }
            visited[idx] = true;
            for(int i = 0;i<M;i++){
                kyo(originSet,i);
            }
        }
    }


}

