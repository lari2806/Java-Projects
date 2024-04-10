package src.Herança;
public class Funcionário extends Pessoa{
    private int Salário;
    private String Função;
    private int Matricula;
    public Funcionário(String nome, int nascimento, int Salário, String Função, int Matricula){
        super(nome, nascimento);
        this.Salário = Salário;
        this.Função = Função;
        this.Matricula = Matricula;
}
 public String  Saudação(){  
  String Employees = super.Saudação();
  return Employees + " minha matricula é" + this.Matricula+"meu Salário é de " + this.Salário + " e minha função é " + this.Função;
}}
