public class SimpleMathOperations {
    static public double add(double a, double b){
        return a+b;
    }
    static public double substract(double a, double b){
        return  a-b;
    }
    static public double multiply(double a, double b){
        return a*b;
    }
    static public double divide(double a, double b) throws DivideByZeroException{
        try{
            if(b==0) throw new DivideByZeroException();

        }catch (DivideByZeroException e){
            System.out.println("Nie mozna dzielic przez zero");
        }

        return a/b;
    }
}

class DivideByZeroException extends Exception{

}
