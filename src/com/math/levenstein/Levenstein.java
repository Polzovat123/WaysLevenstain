package com.math.levenstein;

/**
 * This class can calculate ways levenstein
 *
 * @author Dmitry
 */

public class Levenstein {
    int N, M;
    int[][] D;
    String str1, str2;

    public Levenstein(String _str1, String _str2){
        str1 = _str1;
        str2 = _str2;
        N = str1.length();
        M = str2.length();
        D = new int[N+1][M+1];
    }

    public int calculate(){

        for(int i=0; i<=N; i++){
            for(int j=0; j<=M; j++){
                if(i==0 && j==0){D[i][j] = 0;continue;}
                if(j==0 && i>0){D[i][j] = i;continue;}
                if(i==0 && j>0){D[i][j] = j;continue;}
                D[i][j] = Math.min(
                        Math.min(
                                D[i][j-1]+1,
                                D[i-1][j]+1
                        ),
                        D[i-1][j-1] + checkEqualSymbol(i, j)
                );
            }
        }
        return D[N][M];
    }

    private int checkEqualSymbol(int i, int j){
        if(str1.charAt(i-1)==str2.charAt(j-1))return 0;
        return 1;
    }

}
