import java.util.Scanner;
public class carro {
    public static void main(String [] args) {

        int gasolina;
        int distancia;
        int tempo;
        int vmedia;
        int consumo;

    Scanner teclado = new Scanner(System.in);

    System.out.println("Insira a distancia percorrida (KM) ");
    distancia = teclado.nextInt();

    System.out.println("Insira quantos litros de gasolina");
    gasolina= teclado.nextInt();

    System.out.println("Insira o tempo gasto (horas)");
    tempo= teclado.nextInt();

    vmedia = distancia/tempo;
    consumo = distancia/gasolina;

    System.out.printf("Consumo = %d KM/l\n",  consumo);
    System.out.printf("velocidade media = %d KM/h\n",  vmedia);
}
}