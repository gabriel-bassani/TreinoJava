import java.util.ArrayList;

public class BancoDeDados {
    private ArrayList<Funcionario> funcionarios;
    //private ArrayList<Professor> professores;

    public BancoDeDados(){
        funcionarios = new ArrayList<Funcionario>();
    }

    public void addFuncionario(Funcionario funcionario_arg){
        funcionarios.add(funcionario_arg);
    }

    public void removeFuncionario(Funcionario funcionario_arg){
        for(int i = 0; i < funcionarios.size(); i++){
            if(funcionarios.get(i) == funcionario_arg){
                funcionarios.remove(i);
            }
        }
    }

    public void printFuncionarios(){
        System.out.println("######################### Funcionarios #########################");
        for(int i = 0; i < funcionarios.size(); i++){
            System.out.println("Matricula: " + funcionarios.get(i).getMatricula() + " Nome.: " + funcionarios.get(i).getNome() + "   Tipo.: class " + funcionarios.get(i).getTipo());
        }
    }

    public void printAtividades(){

    }

    /*
    public void printAlunos(){
        System.out.println("######################### Alunos #########################");
        for(int i = 0; i < funcionarios.size(); i++){
            System.out.println("CPF.: " + funcionarios.get(i). + " Nome.: " + funcionarios.get(i).getNome() + "   Idade.: " + funcionarios.get(i).getTipo());
        }
    }
    */
}