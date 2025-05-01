public class PetMachine {

    private boolean limpo = true;

    private int agua = 30;
    
    private int shampoo = 10;
    
    private Pet animal;




    public void banhoAnimal(){
        if(this.animal == null){
            System.out.println("Coloque o animal na máquina para iniciar o banho.");
            return;
        }

        this.agua -= 10;
        this.shampoo -= 2;

        animal.setLimpo(true);
            System.out.println("O animal " + animal.getNome() + " está limpo!");
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

    public boolean petBanho(){
        return animal != null;
    }

    public void setAnimal(Pet animal) {
        if(this.limpo){
            System.out.println("A máquina está suja, para colocar outro animal é necessário limpa-la");
        }
        if(petBanho()){
            System.out.println("O pet " + this.animal.getNome() + "Está na máquina de banho neste momento.");
        }

        this.animal = animal;
    }

    public void removerAnimal(){
        this.limpo = this.animal.isLimpo();

        System.out.println("O pet" + this.animal.getNome() + " está limpo.");

        this.animal= null;
    }

    public void limparMaquina(){
        this.agua -= 10;
        this.shampoo -= 2;
        this.limpo = true;
        System.out.println("A máquina está limpa!");
    }

}
