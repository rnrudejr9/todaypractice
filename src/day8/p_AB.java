package day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_AB {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Integer.parseInt(st.nextToken());
        long m = Integer.parseInt(st.nextToken());

        int count = 1;
        while( n < m ){
            String str = Long.toString(m);
            if(str.endsWith("1")){
                m = m / 10;
            }else if ( m % 2 == 0){
                m = m / 2;
            }else{
                break;
            }
            count++;
        }
        if(m == n){
            System.out.println(count);
        }else{
            System.out.println(-1);
        }
    }
}
