public class DataTypes{
  public static void main(String[] args){
    // types - 1. primitive = stores value in memory
    //         2. non-primitive = stores reference to memory location where dynamic object is stored

    // 1. primitive
    // integer types
    byte aSingleByte = 100; // -128 to 127
    short aSmallNumber = 20000; // -32,768 to 32,767
    int anInteger = 2147483647; // -2147483648 to 2147483647
    long aLargeNumber = 9223372036854775807L;
    // decimal types
    double aDouble = 1.79769313; // 64-bit
    float aFloat = 3.4028F; // 32-bit
    // booleans types
    boolean isWorkday = true;
    boolean isWeekend = false;
    // characters types
    char copyrightSymbol = '\u00A9';
    System.out.println("This is the copyright symbol: " + copyrightSymbol);

    // type conversion
    // 1. implicit
    int num = 6;
    double num1 = num;
    System.out.println(num1);
    // 2. explicit
    double num2 = 5.6;
    int num3 = (int)num2;
    System.out.println(num3); // it removes decimal points use wisely
  }
}