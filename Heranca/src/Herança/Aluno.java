package src.Herança;

public class Aluno extends Pessoa{
    private String curso;
    private int matricula;
    
    public Aluno(String Nome, int nascimento, String curso, int matricula){
    super(Nome,nascimento);
    this.matricula = matricula;
    this.curso = curso;
}

    @Override
public String Saudação(){
    String aluno = super.Saudação();
    return aluno + "minha matricula é "+ this.matricula +" e estou no curso de " + this.curso; 
}}
