
class NumberComplement {
  public static void main(String[] args) {
    int num = 9;
    int result = 0;
    int power = 1;
    while (num > 0) {
      /**
       * Get the last bit of the binary number. In binary is the last digit is 1 the number is odd,
       * if its 0 then its even number. Then perform XOR operation on it. 0101 (decimal 5) XOR 0011
       * (decimal 3) = 0110 (decimal 6)
       */

      int a = (num % 2 ^ 1);
      result += a * power;
      // multiple by 2
      power <<= 1;
      // device by 2
      num >>= 1;
    }
    System.out.println(result);
  }
}
