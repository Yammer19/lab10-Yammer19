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
          if(add==word.charAt(word.length()))System.out.print(printNoDoubleLetterWords(length,word+add,letters));
        }
      }
    }
}
