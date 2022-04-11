public class ExecutaSistemaEscolar {
    public static void main(String[] args){
        Aluno gabriel = new Aluno();
        Prova prova1 = new Prova();
        Prova prova2 = new Prova();

        gabriel.calcularMedia(prova1.calcularNotaTotal(3.0, 3.5), prova2.calcularNotaTotal(4.0, 4.0));
        
        Aluno felipe = new Aluno();
        Prova prova3 = new Prova();
        Prova prova4 = new Prova();

        felipe.calcularMedia(prova3.calcularNotaTotal(4.0, 5.5), prova4.calcularNotaTotal(1.5, 1.5));

        Aluno lorena = new Aluno();
        Prova prova5 = new Prova();
        Prova prova6 = new Prova();

        lorena.calcularMedia(prova5.calcularNotaTotal(4.0, 3.5), prova6.calcularNotaTotal(5.0, 4.0));
        
        Turma turma = new Turma();

        turma.calcularMedia(gabriel.getMedia(), felipe.getMedia(), lorena.getMedia());

        turma.printMedia();
    }
}
