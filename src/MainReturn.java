public class MainReturn {
    public static void main(String[] args) {
        System.out.println("Exercicio Retorno");
        //Criada as variaves aqui que recebem como retorno os valores doubles da classe Return.
        double areaQuadrado = Return.area(3);
        System.out.println("Área do Quadrilatero: "+areaQuadrado);

        double areaRetangulo = Return.area(5,5);
        System.out.println("Área do Retangulo: "+areaRetangulo);

        double areaTarapezio = Return.area(7,8,9);
        System.out.println("Área do Trapezio: "+areaTarapezio);
    }
    //Retornos


}
