import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        /*********에라토스테네스의 체*********/
        ArrayList<Boolean> primeList;

        Scanner in = new Scanner(System.in);
        int m = 123456*2;

        primeList = new ArrayList<>();

        primeList.add(false);
        primeList.add(false);

        for(int i=2; i<=m; i++) {
            primeList.add(i, true);
        }

        for(int i=2; (i*i)<=m; i++) {
            if(primeList.get(i)) {
                for(int j = i*i; j<=m; j+=i) primeList.set(j,false);
            }
        }
        /***********************************/

        while(true) {
            int n = in.nextInt();
            int count = 0;
            if(n == 0) break;

            for(int i=n+1; i<=2*n; i++) {
                if(primeList.get(i) == true) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}