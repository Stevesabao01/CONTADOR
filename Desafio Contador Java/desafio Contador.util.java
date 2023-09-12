import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("12");
        int numero1 = scanner.nextInt();
        
        System.out.println("30");
        int numero2 = scanner.nextInt();
        
        try {
            if (numero1 > numero2) {
                throw new ParametrosInvalidosException("12 < 30");
            }
            
            for (int i = numero1; i <= numero2; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}
