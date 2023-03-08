import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        int x = 0, y = 0;
        int min = 5000;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> set = new HashSet<>();

        for ( int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                set.add(i*3 + j*5);
            }
        }

        if(set.contains(n) ){
            int count = n/3;

            for(x = 0; x < count; x ++) {
                for(y = 0; y < count; y ++) {
                    if((3*x + 5*y == n) && (min > x + y)) {
                        min = x + y;
                    }
                }
            }
            if (min > n/5 && n%5 == 0) {
                min = n/5;
            }
            else if (min > n/3 && n%3 == 0) {
                min = n/3;
            }

            System.out.print(min);

        }
        else {
            System.out.print(-1);
        }
    }
}