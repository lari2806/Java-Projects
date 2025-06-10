import java.util.Scanner;


public class Cifra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.nextLine();

        String[] palavraNaoCifrada = palavra.split("");
         
        String[] alfabeto = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        String[] vogais = {alfabeto[0], alfabeto[4], alfabeto[8], alfabeto[14], alfabeto[20]};

        String[] consoantes = {alfabeto[1], alfabeto[2], alfabeto[3], alfabeto[5], alfabeto[6], alfabeto[7], alfabeto[9], alfabeto[10], alfabeto[11], alfabeto[12], alfabeto[13], alfabeto[15], alfabeto[16], alfabeto[17], alfabeto[18], alfabeto[19], alfabeto[21], alfabeto[22], alfabeto[23], alfabeto[24], alfabeto[25]};
        
        for (int i = 0; i < palavraNaoCifrada.length; i++) {
            for (int j = 0; j < vogais.length; j++) {
                for (int j2 = 0; j2 < consoantes.length; j2++) {

                    if (palavraNaoCifrada[i].equals(vogais[j])) {
                        System.out.println(vogais[j]); 
                        break;
                    
                    } 
                    if(palavraNaoCifrada[i].equals(consoantes[j2])){

                    String consoanteCifrada = (consoantes[ j2 + 1]) ;    
                           
                    System.out.println(consoantes[j2] + vogais[j-i] + consoanteCifrada);
                    }    
                }
            }
        }
    scanner.close();
   }
}

