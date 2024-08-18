package src.Herança;
public class Professor extends Aluno{
    private int anoFormacao;
    public Professor(String nome, int nascimento, String curso, int Matricula, int anoFormacao){   
        super(nome, nascimento, curso, Matricula); 
        this.anoFormacao = anoFormacao; 
      }
      public String  Saudação(){  
        String professor = super.Saudação();
        return professor + " tenho " + this.anoFormacao + " anos de formação";
}
}
