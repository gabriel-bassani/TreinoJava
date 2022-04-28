import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String cpf;
    private String data_nascimento;
    private ArrayList<String> treinos;

    public Aluno(String nome_arg, String cpf_arg, String data_arg){
        this.nome = nome_arg;
        this.cpf = cpf_arg;
        this.data_nascimento = data_arg;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getData(){
        return this.data_nascimento;
    }

    public ArrayList<String> getTreinos(){
        return this.treinos;
    }

    public void setNome(String nome_arg){
        this.nome = nome_arg;
    }

    public void setCpf(String cpf_arg){
        this.cpf = cpf_arg;
    }

    public void setData(String data_arg){
        this.data_nascimento = data_arg;
    }

    public void addTreinos(String treinos_arg){
        boolean isPresent = false;
        for(int i = 0; i < this.treinos.size(); i++){
            if(this.treinos.get(i) == treinos_arg){
                System.out.println("Treino repetido!");
                isPresent = true;
            }
        }
        if(isPresent == false) this.treinos.add(treinos_arg);
    }
}
