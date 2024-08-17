package usuario;

import src.Herança.Aluno;
import src.Herança.Funcionario;
import src.Herança.Pessoa;
import src.Herança.Professor;

public class Usuario{
    public static void main(String[]args){

    Pessoa pessoa = new Pessoa("Larissa", 2007);
    System.out.println(pessoa.Saudação());
    
    Aluno aluno = new Aluno("César", 2008, "Informática", 06234);  
    System.out.println(aluno.Saudação());

    Professor professor = new Professor("Alexandra", 1996, "Informática", 98029, 3);
    System.out.println(professor.Saudação());

    
    Funcionario funcionario = new Funcionario("Lucy", 2000, 5000 , "Doutora", 2222);
    System.out.println(funcionario.Saudação() + "\n");;
    

    }
}
