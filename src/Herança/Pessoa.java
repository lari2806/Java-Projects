    
package src.Herança;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Pessoa{
    protected String Nome;
    protected int Nascimento;
    public String Apelido = "";

    public Pessoa(String Nome, int Nascimento){
        this.Nome = Nome;
        this.Nascimento = Nascimento;

    }
    protected int calcIdade(){
        return(LocalDate.now().getYear()-this.Nascimento);
    }
    public String Saudação(){
        LocalTime hora_atual = LocalTime.now();
        String horaformat = hora_atual.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        int hora = hora_atual.getHour();
        if (hora >= 5 && hora <= 11){
            return horaformat+ " Bom Dia,meu nome é " +this.Nome + " e tenho " + calcIdade() + " anos.";
        } else if(hora >=12 && hora <=18){
            return horaformat+" Boa Tarde,meu nome é  " +this.Nome +  " e tenho " + calcIdade() + " anos.";
        }else if(hora >=19 && hora <=23){
            return horaformat+" Boa Noite, meu nome é  " +this.Nome + " e tenho " + calcIdade() + " anos.";
        }else if(hora >=0 && hora <=4){
            return horaformat+" Vai Dormir, me chamo " +this.Nome + " e tenho " +calcIdade() + " anos.";
        }else{
            return"erro na hora";
        }
    
    }
}