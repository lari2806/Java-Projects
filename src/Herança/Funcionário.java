package src.Herança;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Funcionário extends Pessoa{
    private int Salário;
    private String Função;
    public Funcionário(String nome, int nascimento, int Salário, String Função){
        super(nome, nascimento);
        this.Salário = Salário;
        this.Função = Função;
}
 public String  SaudaçãoFunc(){  
    LocalTime hora_atual = LocalTime.now();
    String horaformat = hora_atual.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    int hora = hora_atual.getHour();
    if (hora >= 5 && hora <= 11){
        return horaformat +" Bom dia, me chamo " + this.Nome + " tenho " + calcIdade() + "anos e ganho " + this.Salário + " reais no meu salário tenho a função de " +  this.Função + ".";
    } else if(hora >=12 && hora <=18){
        return horaformat + " Boa tarde, me chamo " + this.Nome + " tenho " + calcIdade() + "anos e ganho " + this.Salário + " reais no meu salário tenho a função de " +  this.Função + ".";
    }else if(hora >=19 && hora <=23){
        return horaformat + " Boa noite, me chamo " + this.Nome + " tenho " + calcIdade() + "anos e ganho " + this.Salário + " reais no meu salário tenho a função de " +  this.Função + ".";
    }else if(hora >=0 && hora <=4){
        return horaformat + " Vai dormir, me chamo " + this.Nome + " tenho " + calcIdade() + "anos e ganho " + this.Salário + " reais no meu salário tenho a função de " +  this.Função + ".";
    }else{
        return"erro na hora";
    }
  }
}