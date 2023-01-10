public class Driver {
  public static void main(String[] args) {
    char letters[] = {'a','b','c','d'};

    for (int i=0;i<100;i++){
      System.out.println(Recursion.doWords(i));
    }
    System.out.println(Recursion.doWords(191298));
    System.out.println(Recursion.doWords(1512348989));
    System.out.println(Recursion.doWords(123123123));
    System.out.println(Recursion.doWords(12));
    System.out.println(Recursion.doWords(0));

  }

}
