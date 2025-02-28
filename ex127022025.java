// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("MACCAP");
    System.out.println("Integer:" + 10  + 
                      "\n Double:" + 3.14 +
                      "\n Boolean:" + true);


    //variable tipada (int, double, boolean, char, String)  
    int numInt = 9; //entero
    double numDouble = 8.4; //decimal
    boolean numBoolean = true; //booleano
    char numChar = 'A'; //caracter
    String numString = "Cristian";//cadena
    byte edad = 20;//byte
    short numShort = 10;//short
    long numLong = 100;//long
    // int[ ] numArray = {1,2,3,4,5};
    // String[ ] numArray2 = {"Cristian", "Juan", "Pedro"};
    
    System.out.println("tInteger: " + numInt  + 
                        "\n tDouble: " + numDouble +
                        "\n tBoolean: " + numBoolean + 
                        "\n tChar: " + numChar +
                        "\n tString: " + numString +
                        "\n tByte: " + edad +
                        "\n tShort: " + numShort + 
                        "\n tLong: " + numLong); 

  
    //operadores aritmeticos o de asignacion 
    // suma +, resta -, multiplicacion *, division /, modulo %
    // asignacion =, asignacion de suma +=, asignacion de resta -=, asign
    
    int num1 = 11;
    int num2 = 5;
    int suma = num1 + num2;
    int rest = num1 - num2;
    int multi = num1 * num2;
    double divi = num2 / num1;
    int modulo = num1 % num2;
    System.out.println("Suma: " + suma +
                      "\n Resta: " + rest +
                      "\n Multiplicacion: " + multi +
                      "\n Division: " + divi + 
                       "\n Modulo: " + modulo);
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
