public class Aluno {
   private double media;
   public double calcularMedia(double prova1, double prova2){
      media = (prova1 + prova2)/2;

      return media;
   }
   public double getMedia(){
      return media;
   }
}