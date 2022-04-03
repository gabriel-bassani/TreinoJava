public class CalculaIMC {
    public static void main(String[] arggs){
        Pessoa pessoa = new Pessoa();

        pessoa.setPeso(85);
        pessoa.setAltura(1.83);

        System.out.println("Peso:" + pessoa.getPeso());
        System.out.println("Altura:" + pessoa.getAltura());
        System.out.println("IMC:" + pessoa.calculaIMC());
        System.out.println("Situacao:" + pessoa.informarIMC(pessoa.calculaIMC()));
    }
}
