import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ticker = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(ticker == 0){
                    System.out.print("BB");
                    ticker++;
                } else {
                    System.out.print("AA");
                    ticker--;
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}