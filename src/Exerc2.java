import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Contagem de letras 'a'. \n");
        System.out.println("Digite uma palavra");

        String word = scanner.nextLine();
        
        int aQuantities = 0;

        for (int i = 0; i < word.length(); i++) {
            char a = word.charAt(i);
            if (a == 'A' || a == 'a') {
                aQuantities++;
            }
        }
        
        System.out.println(aQuantities);
        

        scanner.close();

    }
}
