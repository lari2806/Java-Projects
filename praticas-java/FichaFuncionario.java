import java.util.Scanner;

public class FichaFuncionario {
    public static void main(String[] args) {

        System.out.println("Digite o nome do funcionário: ");
        Scanner nomeFunc = new Scanner(System.in);
        String nomeFuncionarioString = nomeFunc.nextLine();

        System.out.println("Digite o seu salario fixo: "); 
        Scanner salarioFixo = new Scanner(System.in);
        Float salario = salarioFixo.nextFloat();

        System.out.println("Total de vendas feitas nesse mês: ");
        Scanner totalVendas = new Scanner(System.in);
        int vendas = totalVendas.nextInt();

        System.out.println("FEITO MENSAL DO FUNCIONÁRIO: " + nomeFuncionarioString);
        System.out.println("nome do : " + nomeFuncionarioString);
        System.out.println("Salário fixo: " + salario);
        System.out.println("Total de vendas: " + vendas);

        nomeFunc.close();
        salarioFixo.close();
        totalVendas.close();
    }
}
