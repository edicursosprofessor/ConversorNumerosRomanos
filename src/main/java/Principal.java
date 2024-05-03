import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor();

        System.out.println("### Conversor de números Decimais para Romanos ###");
        System.out.println("Digite o número que deseja converter: ");

        int numeroDecimal = scanner.nextInt();
        String numeroRomano = conversor.converter(numeroDecimal);

        System.out.println("Resultado da conversão: " + numeroRomano);
        scanner.close();
    }

}
