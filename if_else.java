import java.util.Scanner;
public class if_else {
    public static void main(String [] args) {

        int n, numero1, numero2;
        

    Scanner teclado = new Scanner(System.in);

    System.out.println("Insira n");
    n = teclado.nextInt();

    System.out.println("Insira o primeiro valor");
    numero1= teclado.nextInt();

    System.out.println("Insira o segundo valor");
    numero2= teclado.nextInt();

    if ( numero1 > n)
    System.out.println("Numero 1 esta depois de n");
    else if ( numero1 == n)
    System.out.println("Numero 1 esta dentro de n");
    else 
    System.out.println("Numero 1 esta antes de n");

    if ( numero2 > n)
    System.out.println("Numero 2 esta depois de n");
    else if ( numero2 == n)
    System.out.println("Numero 2 esta dentro de n");
    else 
    System.out.println("Numero 2 esta antes de n");

    
    
}
}
