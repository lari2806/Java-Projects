public class PetMachine {

    private boolean limpo = true;

    private int agua = 30;
    
    private int shampoo = 10;
    
    private Pet pet;




    public void banhopet(){
        if(this.pet == null){
            System.out.println("Coloque o pet na máquina para iniciar o banho.");
            return;
        }

        this.agua -= 10;
        this.shampoo -= 2;

        pet.setLimpo(true);
            System.out.println("O pet " + pet.getNome() + " está limpo!");
    }

    public void adicionarAgua(){
        if(agua == 30){
            System.out.println("A capacidade de água da máquina está no máximo.");
            return;
        }

        else{
            agua += 2;
        }
    }

    public int getAgua() {
        return agua;
    }

    public int getShampoo() {
        return shampoo;
    }

    public void adicionarShampoo(){
        if(shampoo == 10){
            System.out.println("A capacidade de shampoo da máquina está no máximo.");
            return;
        }else{
            shampoo += 2;
        }
    }

    public boolean VerificarSeTemPet(){
        return pet != null;
    }

    public void setpet(Pet pet) {
        if(this.limpo){
            System.out.println("A máquina está suja, para colocar outro pet é necessário limpa-la");
            
        }
        if(VerificarSeTemPet()){
            System.out.println("O pet " + this.pet.getNome() + "Está na máquina de banho neste momento.");
            return;
        }

        this.pet = pet;

    }

    public void removerpet(){
        this.limpo = this.pet.isLimpo();

        System.out.println("O pet" + this.pet.getNome() + " está limpo.");

        this.pet= null;
    }

    public void limparMaquina(){
        this.agua -= 10;
        this.shampoo -= 2;
        this.limpo = true;
        System.out.println("A máquina está limpa!");
    }

}
