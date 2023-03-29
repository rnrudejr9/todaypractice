package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.TreeSet;


//탐색할때 좋은 자료구조는 무엇인가?



public class Sp_듣보잡 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str=  br.readLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);


        HashSet<String> hashSet = new HashSet<>();
        for(int i =0; i<n;i++){
            hashSet.add(br.readLine());
        }

        TreeSet<String> treeSet = new TreeSet<>();
        for(int j=0;j<m;j++){
            String temp = br.readLine();
            if(hashSet.contains(temp)){
                treeSet.add(temp);
            }
        }

        System.out.println(treeSet.size());
        for(String s :treeSet){
            System.out.println(s);
        }
    }
}
