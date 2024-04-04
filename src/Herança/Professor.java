package src.Herança;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Professor extends Aluno{
    private int anoformação;
    public Professor(String Nome, int Nascimento, String Curso, int Matricula, int anoformação){   
        super(Nome, Nascimento, Curso, Matricula); 
        this.anoformação = anoformação; 
      }
      public String  SaudaçãoTeacher(){  
            LocalTime hora_atual = LocalTime.now();
            String horaformat = hora_atual.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            int hora = hora_atual.getHour();
            if (hora >= 5 && hora <= 11){
                return horaformat +" Bom dia, me chamo " + this.Nome + " tenho " + calcIdade() + "anos e tenho " + this.anoformação + " anos de formação.";
            } else if(hora >=12 && hora <=18){
                return horaformat + "Boa tarde, me chamo " + this.Nome + " tenho " + calcIdade() + " anos e tenho " + this.anoformação + " anos de formação.";
            }else if(hora >=19 && hora <=23){
                return horaformat + " Boa noite, me chamo " + this.Nome + " tenho " + calcIdade() + " anos e tenho " + this.anoformação + " anos de formação.";
            }else if(hora >=0 && hora <=4){
                return horaformat + " Vai dormir, me chamo " + this.Nome + " tenho " + calcIdade() + " anos e tenho " + this.anoformação + " anos de formação.";
            }else{
                return"erro na hora";
            }
}
}