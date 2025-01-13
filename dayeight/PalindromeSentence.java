package dayeight;

public class PalindromeSentence {
    public static int countPalindromes(String sentence){
        int count = 0;
        String[] words = sentence.split(" ");
        StringBuilder stringBuilder;
        for(String word:words){
            stringBuilder = new StringBuilder(word);
            String reveresed = stringBuilder.reverse().toString();
            if(reveresed.equalsIgnoreCase(word))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        // String original = "madam";
        // StringBuilder stringBuilder = new StringBuilder(original);
        // String reveresed = stringBuilder.reverse().toString();
        // System.out.println(original.equals(reveresed));
        String sentence = "Madam Arora teaches malayalam";
        System.out.println(countPalindromes(sentence));
        sentence = "Nitin speaks malayalam";
        System.out.println(countPalindromes(sentence));
    }
}
