public class Pessoa {
    private double peso;
    private double altura;
    
    public double getPeso(){
        return peso;
    }

    public double getAltura(){
        return altura;
    }

    public double setPeso(double x){
        peso = x;

        return peso;
    }

    public double setAltura(double x){
        altura = x;

        return altura;
    }

    public double calculaIMC(){
        double imc = peso / (altura * altura);

        return imc;
    }

    public String informarIMC(double imc){
        String situacao = "";
        
        if(imc < 18.5) situacao = "Abaixo do peso.";
        if(imc > 18.5 && imc <= 24.9) situacao = "Peso normal.";
        if(imc > 24.9 && imc <= 29.9) situacao = "Pre-obesidade.";
        if(imc > 29.9 && imc <= 34.9) situacao = "Obesidade Grau 1.";
        if(imc > 34.9 && imc <= 39.9) situacao = "Obesidade Grau 2.";
        if(imc > 40) situacao = "Obesidade Grau 3.";
    

        return situacao;
    }
}