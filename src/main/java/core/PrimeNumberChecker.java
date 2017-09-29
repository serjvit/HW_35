package core;
public class PrimeNumberChecker {
       static boolean validate(int i) {
              for (int j = 2; j < (i); i++) {
                     if (i % j == 0) {return false;}
} return true;
       }
}