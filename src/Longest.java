import java.util.ArrayList;

public class Longest {

    public static void main(String[] args){
//        String[] words = {"mom", "blithe", "get", "absolute", "tacocat", "adobo", "audio", "agog", "morn", "question", "exhorting"};
        ArrayList<String> words = new ArrayList<String>();
        words.add("mom");
        words.add("blithe");
        words.add("get");
        words.add("absolute");
        words.add("tacocat");   words.add("adobo");   words.add("audio");   words.add("agog");
        words.add("morn");   words.add("question");   words.add("exhorting");
        findTheLongest(words);
    }

    public static void findTheLongest(ArrayList<String> givenArray){

//        String[] filter = {};

        ArrayList<String> filter = new ArrayList<String>();
        for(int i=0;i<givenArray.size();i++){
            System.out.println(givenArray.get(i));
            String string = givenArray.get(i);
            char letter = string.charAt(0);
            System.out.println(letter);
//            if(givenArray[i][0] == 'a') {

//            if(!(givenArray[i][0] == 'a' || givenArray[i][0] == 'e' || givenArray[i][0] == 'i' || givenArray[i][0] == 'o' ||givenArray[i][0] == 'u')){

            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                 filter.add(givenArray.get(i));
                System.out.println(filter);
            }

        }

        int lengthOfWord = 0;
//        int standaradLength = 0;

        String longest = "";

//loop over the new array of strings
        for(int j=0 ;j<filter.size();j++){
          String filterWord = filter.get(j);
lengthOfWord = filterWord.length();
//standardlength = lengthOfArray;

            if (lengthOfWord > longest.length()){
                longest = filter.get(j);
            }

        }

        System.out.println("The longest words starts with Consonant is "  + longest );
    }
}
