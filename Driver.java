public class Driver {
  public static void main(String[] args) {
    char letters[] = {'a','b','c','d'};
    System.out.println(Recursion.doWords(19));
    System.out.println(Recursion.doWords(89));
    for (int i=0;i<100;i++){
      System.out.println(Recursion.doWords(i));
    }
  }

}
