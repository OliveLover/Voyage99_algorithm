import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list;
        int count;
        while (true) {
            int n = in.nextInt();
            count = 0;
            if (n == 0) break;

            for(int i=n+1; i<=2*n; i++) {
                list = new ArrayList<Integer>();
                for(int j = 1; j<=i; j++) {
                    if(i%j == 0) {
                        list.add(j);
                    }
                }

                if(list.size() == 2) count++;

            }
            System.out.println(count);
        }
    }
}