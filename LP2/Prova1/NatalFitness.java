//import java.time.LocalDate;

public class NatalFitness {
    public static void main(String[] args){
        Gerente funcionario1 = new Gerente("001", "Bernardo");
        Professor funcionario2 = new Professor("002", "Popeye");
        funcionario2.setTipo("imd.Professor [Musculacao]");
        Professor funcionario3 = new Professor("003", "Phelps");
        funcionario3.setTipo("imd.Professor [Natacao]");
        Professor funcionario4 = new Professor("004", "Arnold");
        funcionario4.setTipo("imd.Professor [Musculacao]");
        Aluno aluno1 = new Aluno("Neymar", "584.659.745-62", "29");
        Aluno aluno2 = new Aluno("Marta","234.897.954-78", "35");
        Aluno aluno3 = new Aluno("Bruninho do Volei","345.234.954-13", "35");

        aluno1.addTreinos("10:00=Hipertrofia");
        aluno1.addTreinos("11:00=Ergometria");

        aluno2.addTreinos("08:00=Nado de Costas");
        aluno2.addTreinos("07:00=Nado Livre");
        aluno2.addTreinos("09:00=Nado Borboleta");

        aluno3.addTreinos("11:00=Hipertrofia");
        aluno3.addTreinos("07:00=Ergometria");

        //LocalDate birthdate = new LocalDate (1970, 1, 20);
        //Aluno aluno1 = new Aluno("Neymar", "584.659.745-62", "29");

        BancoDeDados banco = new BancoDeDados();

        banco.addFuncionario(funcionario1);
        banco.addFuncionario(funcionario2);
        banco.addFuncionario(funcionario3);
        banco.addFuncionario(funcionario4);

        banco.printFuncionarios();

        
    }
}
