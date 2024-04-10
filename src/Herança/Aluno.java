package src.Herança;

public class Aluno extends Pessoa{
    private String Curso;
    private int Matricula;
    
    public Aluno(String Nome, int Nascimento, String Curso, int Matricula){
    super(Nome,Nascimento);
    this.Matricula = Matricula;
    this.Curso = Curso;
}

    @Override
public String Saudação(){
    String Student = super.Saudação();
    return Student + "minha matricula é "+ this.Matricula +" e estou no curso de " + this.Curso; 
}}
