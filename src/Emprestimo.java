public class Emprestimo {

    public static int getDuasParcelas(){
        return 2;
    }
    public static int getTresParcelas(){
        return 3;
    }
    public static double getTaxaDuasParcelas(){
        return 0.3;
    }
    public static double getTaxaTresParcelas(){
        return 0.45;
    }

    public static void calcular(double valor, int parcelas){

        if (parcelas ==2){
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("O valor final para o emprestimo em Duas parcelas é: "+ valorFinal);
        }else if (parcelas == 3){
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("O valor final para o emprestimo em Tres parcelas é: "+ valorFinal);
        }else {
            System.out.println("valor de Parcela não aceita");
        }
    }

}
