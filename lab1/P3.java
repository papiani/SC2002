import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int starting = scanner.nextInt();
        int ending = scanner.nextInt();
        int increment = scanner.nextInt();
        for(int i = starting; i <= ending; i += increment){
            System.out.println(i*1.82);
        }
        scanner.close();
    }
}
