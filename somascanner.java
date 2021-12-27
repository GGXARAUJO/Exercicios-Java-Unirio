import java.util.Scanner;

public class somascanner {
    public static void main(String [] args) {
    int idade;
    int vasco;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Qual a sua idade ? ");
    idade = teclado.nextInt();

    vasco = idade + 10;
    System.out.printf("Idade = %d\n", vasco);
    
}
}