public class Gerente extends Funcionario{
    private String salario;

    public Gerente(String matricula_arg, String nome_arg){
        super(matricula_arg, nome_arg);
    }

    public String getSalario(){
        return this.salario;
    }

    public void setSalario(String salario_arg){
        this.salario = salario_arg;
    }
}
