import java.util.Scanner;

public class Main {

    private final static Scanner  scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();
    public static void main(String[] args) throws Exception {

        var opçao = -1;


    do {

        System.out.println("==== Escolha uma das opções ====");
        System.out.println("1- Dar banho no pet.");
        System.out.println("2- Abastecer a máquina com água.");
        System.out.println("3- Abastecer a máquina com shampoo.");
        System.out.println("4- Verificar água na máquina.");
        System.out.println("5- Verificar shampoo na máquina.");
        System.out.println("6 - Verificar se tem pet no banho. ");
        System.out.println("7 - Colocar pet na máquina.");
        System.out.println("8 - Retirar pet da máquina");
        System.out.println("9 - Limpar máquina.");
        System.out.println("0 - Sair.");

        opçao = scanner.nextInt();

        switch (opçao) {
            case 1 -> petMachine.banhopet();
            case 2 -> setAgua();
            case 3 -> setshampoo();
            case 4 -> verificarAgua();
            case 5 -> verificarShampoo();
            case 6 -> ChecarPetMaquina();
            case 7 -> setPetmaquina();
            case 8 -> petMachine.removerpet();
            case 9 -> petMachine.limparMaquina();
            case 0 -> System.exit(0);
            default-> System.out.println("Opção inválida.");



                
        }


        }while(true);
    }

    private static void setAgua(){
        System.out.println("Tentando colocar água na máquina");
        petMachine.adicionarAgua();
       
    }
    private static void setshampoo(){
        System.out.println("Tentando colocar shampoo na máquina");
        petMachine.adicionarShampoo();
    }
    private static void verificarAgua(){
        var quantidade = petMachine.getAgua();
        System.out.println("A máquina está no momento com " + quantidade +  "litro(s) de água");
        
    }

    private static void verificarShampoo(){
        var quantidade = petMachine.getShampoo();
        System.out.println("A máquina está no momento com " + quantidade +  "litro(s) de shampoo");
        
    }
    private static void ChecarPetMaquina(){
        var verificarSeTemPet = petMachine.VerificarSeTemPet();
        System.out.println(verificarSeTemPet ? "Há pet na maquina." : "Não há pet na máquina.");
    }

    public static void setPetmaquina(){
        var nome= "";
        while(nome.isEmpty() || nome == null){
            System.out.println("Indique o nome do pet: ");
            nome = scanner.next();
        }
        var pet = new Pet(nome);
        petMachine.setpet(pet);

        
    }
}
