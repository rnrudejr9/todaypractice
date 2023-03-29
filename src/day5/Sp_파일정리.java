package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Sp_파일정리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String,Integer> map = new TreeMap<>();
        for(int i = 0;i<n;i++){
            String[] str = br.readLine().split( "\\.");
            if(!map.containsKey(str[1])){
                map.put(str[1],1);
            }else{
                map.put(str[1],map.get(str[1])+1);
            }
        }

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
