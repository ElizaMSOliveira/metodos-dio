public class Return {
    //Clase criada com valor de retorno double e não void.
    //Ela retorna um valor que é armazenado na variavel na classe main criada que a chama
    public static double area(double lado){
        return lado * lado;
    }
    public static double area(double lado1, double lado2){
      return lado1 * lado2;
    }
    public static double area(double baseMaior, double baseMenor, double altura){
        return ((baseMaior + baseMenor)*altura) / 2;
    }
}
