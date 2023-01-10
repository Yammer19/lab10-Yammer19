public class Recursion{

   /*Print all words that are made of the letters a-e inclusive.
    *@param length : the length of the words that are to be printed
    */
    public static void printAllWords(int length){
      //do not change this method.
      printAllWords(length,"");
    }

   /*Print all words that are made of the letters a-e inclusive.
    *@param length : either how many more letters or the total length depending on implementation
    *@param word   : the partial word so far.
    */
    public static void printAllWords(int length,String word){
      if(word.length()==length) {
        System.out.println(word);
      }
      else{
        for(char letter = 'a' ; letter <= 'e'; letter++){
          printAllWords(length,word+letter);
        }
      }
    }

  /*Print all words that are made of the characters in the array of letters.
    *There may not be consecutive equal letters, so:
    *aax is not allowed, but axa is allowed.
    *@param length : the length of the words that are to be printed
    *@param letters: the letters you should be using
    *@precondition: letters contains at least 2 characters, and has no duplicates.
    */
    public static void printNoDoubleLetterWords(int length,char[] letters){
      //do not change this method
      printNoDoubleLetterWords(length,"",letters);
    }

    /*Print all words that are made of the characters in letters. There may not be consecutive equal letters,
    *aax is not allowed, but axa is allowed.
    *@param length : either how many more letters need to be
    *@param word   : the partial word so far.
    *@param letters: the letters you should be using
    */
    public static void printNoDoubleLetterWords(int length,String word,char[]letters){
      if(word.length()==length){
        System.out.println(word);
      }
      else{
        for(char add : letters){
          if(word.length()>0){
            if(word.charAt(word.length()-1)!=add) printNoDoubleLetterWords(length,word+add,letters);
          }
          else{
            printNoDoubleLetterWords(length,word+add,letters);
          }
        }
      }
    }
    public static String doWords(int n){
      if (n==0) return "zero";
      else{
        return toWords(n);
      }
    }
    public static String toWords(int n){
      if(n<=19){
        if (n==0) return "";
        if (n==1) return "one";
        if (n==2) return "two";
        if (n==3) return "three";
        if (n==4) return "four";
        if (n==5) return "five";
        if (n==6) return "six";
        if (n==7) return "seven";
        if (n==8) return "eight";
        if (n==9) return "nine";
        if (n==10) return "ten";
        if (n==11) return "eleven";
        if (n==12) return "twelve";
        String t = "teen";
        if (n==13) return "thir"+t;
        if (n==14) return "four"+t;
        if (n==15) return "fif"+t;
        if (n==16) return "six"+t;
        if (n==17) return "seven"+t;
        if (n==18) return "eigh"+t;
        if (n==19) return "nine"+t;

      }
      if (n<100){
        int x = n/10;
        String r = "";
        if (n%10!=0) r = "-"+toWords(n%10);
        if (x==2) return "twenty"+r;
        if (x==3) return "thirty"+r;
        if (x==4) return "fourty"+r;
        if (x==5) return "fifty"+r;
        if (x==6) return "sixty"+r;
        if (x==7) return "seventy"+r;
        if (x==8) return "eighty"+r;
        if (x==9) return "ninety"+r;
      }
      if (n<1000){
        String out = toWords(n/100) + "-hundred";
        if (n%100>0) out+= " and " + toWords(n%100);
        return out;
      }
      if (n<1000000){
        String out = toWords(n/1000) + " thousand";
        if (n%1000>0) out+= " " + toWords(n%1000);
        return out;
      }
      if (n<1000000000){
        String out = toWords(n/1000000) + " million";
        if (n%1000000>0) out+= " " + toWords(n%1000000);
        return out;
      }
        String out = toWords(n/1000000000) + " billion";
        if (n%1000000000>0) out+= " " + toWords(n%1000000000);
        return out;
    }
}
