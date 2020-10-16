import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a = 21;
        long[][] m = new long [a][a];
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m.length; j++){
                m[i][j]=0;
            }
        }
        for (int i=0; i<m.length; i++){ //делаем первую строку из единичек
            m[0][i]=1;
        }
        for (int i=0; i<m.length; i++){ //делаем первый столбец из единичек
            m[i][0]=1;
        }
        for(int i=1; i<m.length; i++){
            for(int j=1; j<m.length; j++){
                m[i][j]=m[i-1][j]+ m[i][j-1];
            }
        }
        System.out.println(m[a-1][a-1]);


    }

}
