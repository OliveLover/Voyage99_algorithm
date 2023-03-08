import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Boolean> primeList;

        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n  = in.nextInt();

        if(n <= 1) return;  //n<=1 일때 종료

        primeList = new ArrayList<Boolean>(n+1);

        primeList.add(false);   //0번째 소수 아님으로 처리
        primeList.add(false);   //1번째 소수 아님으로 처리

        //2~n까지 소수로 설정
        for(int i=2; i<=n; i++) {
            primeList.add(i, true);
        }
        //2부터 ~ i*i <= n
        //각각의 배수들을 지워가기
        for(int i=2; (i*i)<=n; i++){
            if(primeList.get(i)) {
                for(int j = i*i; j<=n; j+=i) primeList.set(j,false);
            }
        }
        //출력
        for (int i = m; i<=n; i++) {
            if(primeList.get(i) == true){
                System.out.println(i);
            }
        }
    }
}