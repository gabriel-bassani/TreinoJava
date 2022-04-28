import java.util.ArrayList;

public class Professor extends Funcionario{
    //private String tipo;
    private ArrayList<Aluno> alunos;

    public Professor(String matricula_arg, String nome_arg){
        super(matricula_arg, nome_arg);
        //this.tipo = tipo_arg;
    }

    public String getTipo(){
        return this.tipo;
    }

    public ArrayList<Aluno> getAlunos(){
        return alunos;
    }

    public void setTipo(String tipo_arg){
        this.tipo = tipo_arg;
    }

    public void addAluno(Aluno aluno_arg){
        boolean isPresent = false;
        for(int i = 0; i < this.alunos.size(); i++){
            if(this.alunos.get(i) == aluno_arg){
                System.out.println("Aluno repetido!");
                isPresent = true;
            }
        }
        if(isPresent == false)this.alunos.add(aluno_arg);
    }
}
