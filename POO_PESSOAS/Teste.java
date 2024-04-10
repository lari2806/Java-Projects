import src.Herança.*;
public class Teste{
    public static void main(String[]args){

    Pessoa Cousin = new Pessoa("Larissa", 2007);
    System.out.println(Cousin.Saudação());
    
    Aluno Student = new Aluno("César", 2008, "Informática", 06234);  
    System.out.println(Student.Saudação());

    Professor Teacher = new Professor("Alexandra", 1996, "Informática", 98029, 3);
    System.out.println(Teacher.Saudação());

    
    Funcionário Employees = new Funcionário("Lucy", 2000, 5000 , "Doutora", 2222);
    System.out.println(Employees.Saudação() + "\n");;
    

    }
}
