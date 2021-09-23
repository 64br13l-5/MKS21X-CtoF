public class CtoFTester{
    public static void main(String[]args){
        System.out.println(celsiustoFahrenheit(25));
        System.out.println(fahrenheitToCelsius(57));

    }
    public static int celsiustoFahrenheit(int c){
        return c*(9/5)+32;
    }
    public static int fahrenheitToCelsius(int f){
        return (f-32)/(9/5);
    }
}
