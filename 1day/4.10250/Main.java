import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int h = 0, w = 0, n = 0;
        for(int i=0; i<t; i++) {
            h = in.nextInt();
            w = in.nextInt();
            n = in.nextInt();

            int a = n%h;        //층
            int b = n/h + 1;    //호실

            if (a == 0) {  //사람 인원수와 높이가 나누어 떨어질 경우
                a = h;
                b -= 1;
            }
            if (b < 10){
                System.out.println(a+"0"+b);
            } else {
                System.out.println(a+""+b);
            }
        }
    }
}