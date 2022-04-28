import java.util.ArrayList;

public class Funcionario {
    private String matricula;
    private String nome;
    protected String tipo;
    protected ArrayList<Aluno> alunos;
    
    public Funcionario(String matricula_arg, String nome_arg){
        this.matricula = matricula_arg;
        this.nome = nome_arg;
        this.tipo = "imd.Funcionario";
    }

    public String getMatricula(){
        return this.matricula;
    }

    public String getNome(){
        return this.nome;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setMatricula(String matricula_arg){
        this.matricula = matricula_arg;
    }

    public void setNome(String nome_arg){
        this.nome = nome_arg;
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
