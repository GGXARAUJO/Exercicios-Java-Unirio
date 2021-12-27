import java.util.Scanner;
public class somar2variaveis {
    public static void main(String [] args) {
        int soma1;
        int soma2;
        int somatotal;

        Scanner teclado = new Scanner(System.in);

        System.out.println("SOMAR 2 VALORES ");

        System.out.println("insira o primeiro valor ");
        soma1 = teclado.nextInt();

        System.out.println("insira o segundo valor ");
        soma2 = teclado.nextInt();
    
       somatotal = soma1 + soma2; 
        System.out.printf("Soma = %d\n", somatotal);
}
}