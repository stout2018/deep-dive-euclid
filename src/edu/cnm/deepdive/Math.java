package edu.cnm.deepdive;

public class Math {

  public static long gcd(long a, long b) {
    a = java.lang.Math.abs(a);
    b = java.lang.Math.abs(b);
    if (a == 0) {
      return b;
    } else if (b == 0) {
      return a;
    }
    while (a != b) {
      if (a > b) {
        a -= b;
      } else {
        b -= a;
      }
    }
    return a;
  }
  
}
