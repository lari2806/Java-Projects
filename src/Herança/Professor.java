package src.Herança;
public class Professor extends Aluno{
    private int anoformação;
    public Professor(String Nome, int Nascimento, String Curso, int Matricula, int anoformação){   
        super(Nome, Nascimento, Curso, Matricula); 
        this.anoformação = anoformação; 
      }
      public String  Saudação(){  
        String Teacher = super.Saudação();
        return Teacher + " tenho " + this.anoformação + " anos de formação";
}
}
