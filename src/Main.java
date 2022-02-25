public class Main {

    public static void main(String[] args) {
        //Calculadora
        System.out.println(" Calculadora");

        Calculadora.soma(3, 6);
        Calculadora.subtracao(9,1.0);
        Calculadora.mutiplicacao(7,8);
        Calculadora.divisao(5,2.5);

        //Mensagem
        System.out.println("Mensagem");
        Menssagem.obeterMessagem(4);

        //Emprestimo
        //Chamando o Metodo e passando parametros
        Emprestimo.calcular(1000,2);
        Emprestimo.calcular(1000, 3);
        Emprestimo.calcular(1000, 5);
        //Chamando o metodo dentro do outro.
        Emprestimo.calcular(1200, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1200, Emprestimo.getTresParcelas());
        System.out.println("");

        }
}
