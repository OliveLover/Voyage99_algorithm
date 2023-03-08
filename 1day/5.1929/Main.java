import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list;
        int m = in.nextInt();
        int n = in.nextInt();

        for(int i=m; i<=n; i++ ) {
            list = new ArrayList<>();
            for(int j=1; j<=i; j++) {
                if(i%j == 0) {
                    list.add(j);
                }
            }
            if(list.size() == 2) {
                System.out.println(i);
            }
        }
    }
}