package src.Herança;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Aluno extends Pessoa{
    private String Curso;
    private int Matricula;
    public Aluno(String Nome, int Nascimento, String Curso, int Matricula){
    super(Nome,Nascimento);
    this.Matricula = Matricula;
    this.Curso = Curso;
}

public String SaudaçãoStud(){
    LocalTime hora_atual = LocalTime.now();
    String horaformat = hora_atual.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    int hora = hora_atual.getHour();
    if (hora >= 5 && hora <= 11){
        return horaformat +" Bom dia, o nome do aluno(a) é "+ this.Nome + ", tem "+ calcIdade() + " anos, o número de sua matrícula é " + this.Matricula + " e está cursando  " + this.Curso + ".";
    } else if(hora >=12 && hora <=18){
        return horaformat +" boa tarde,o nome do aluno(a) é "+ this.Nome + ", tem "+ calcIdade() + " anos, o número de sua matrícula é " + this.Matricula + " e está cursando  " + this.Curso + "." ;
    }else if(hora >=19 && hora <=23){
        return horaformat +" boa noite,o nome do aluno(a) é "+ this.Nome + ", tem "+ calcIdade() + " anos, o número de sua matrícula é " + this.Matricula + " e está cursando  " + this.Curso + ".";
    }else if(hora >=0 && hora <=4){
        return horaformat +"vai dormir, o nome do aluno(a) é "+ this.Nome + ", tem "+ calcIdade() + " anos, o número de sua matrícula é " + this.Matricula + " e está cursando  " + this.Curso + "." ;
    }else{
        return"erro na hora";
    }
}
}