package src.Herança;
public class Funcionario extends Pessoa{
    private int salario;
    private String funcao;
    private int matricula;
    public Funcionario(String nome, int nascimento, int salario, String funcao, int matricula){
        super(nome, nascimento);
        this.salario = salario;
        this.funcao = funcao;
        this.matricula = matricula;
}
 public String  Saudação(){  
  String funcionario = super.Saudação();
  return funcionario + " minha matricula é" + this.matricula+"meu Salário é de " + this.salario + " e minha funçao é " + this.funcao;
}}
