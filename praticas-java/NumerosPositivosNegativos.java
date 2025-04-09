import java.util.Scanner;

public class NumerosPositivosNegativos {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        try (Scanner dadoUsuario = new Scanner(System.in)) {
            int numero = dadoUsuario.nextInt();
            if(numero >= 0){
                System.out.println("Este numero é positivo.");
            }
            else if (numero < 0){
                System.out.println("Este número é negativo.");
            }
            else {
                System.out.println("número não identificado");
            }
        }
    }

}
