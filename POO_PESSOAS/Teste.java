import src.Herança.*;
public class Teste{
    public static void main(String[]args){

    Pessoa Cousin = new Pessoa("Larissa", 2007);
    System.out.println(Cousin.Saudação() + "\n");
    
    Aluno Student = new Aluno("César", 2008, "Informática", 06234);  
    System.out.println(Student.SaudaçãoStud());

    Professor Teacher = new Professor("Alexandra", 1996, "Informática", 98029, 3);
    System.out.println(Teacher.Saudação());
    System.out.println(Teacher.SaudaçãoStud());
    System.out.println(Teacher.SaudaçãoTeacher() + "\n");
    
    Funcionário Employees = new Funcionário("Lucy", 2000, 5000 , "Doutora");
    System.out.println(Employees.SaudaçãoFunc() + "\n");
    System.out.println(Student.Saudação() + "\n");
    

    }
}