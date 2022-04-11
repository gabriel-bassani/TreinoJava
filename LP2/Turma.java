public class Turma {
    private double media;

    public void printMediaAluno(double aluno1, double aluno2, double aluno3){
        System.out.println("Media dos alunos: " + aluno1 + ", " + aluno2 + ", " + aluno3);
    }
    public double calcularMedia(double aluno1, double aluno2, double aluno3){
        media = (aluno1 + aluno2 + aluno3)/3;

        printMediaAluno(aluno1, aluno2, aluno3);

        return media;
    }
    public void printMedia(){
        System.out.println("Media geral da turma " + media);
    }
}
