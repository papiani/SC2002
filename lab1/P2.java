
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();
        int merit = scanner.nextInt();
        if(salary <= 650 && salary >= 600 && merit >= 10){
            System.out.println("Grade B");
        } else if (salary <= 650 && salary >= 600 && merit < 10){
            System.out.println("Grade C");
        } else if(salary<=799 && salary >= 750 && merit >= 20){
            System.out.println("Grade A");
        } else {
            System.out.println("Grade B");
        }
        scanner.close();
    }
}

