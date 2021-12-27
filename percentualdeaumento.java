import java.util.Scanner;
public class percentualdeaumento {
    public static void main(String [] args) {
    int salario;
    float porcento;
    float salario2;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Qual o seu salario ? ");
    salario = teclado.nextInt();

    System.out.println("Porcentagem de aumento ");
    porcento = teclado.nextInt();

    salario2 = ((salario * porcento)/100) + salario;

    System.out.printf("Salario com aumento = %.2f\n", salario2 );
    
}

}
