import java.util.Scanner;
class InnerwordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        if (pattern.length() != words.length) {
            return false;}

        HashMap<Character, String> charToWord = new HashMap<>();
        HashSet<String> seenWords = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(w)) {
                    return false;}
            } else {
                if (seenWords.contains(w)) {
                    return false;}
                charToWord.put(c, w);
                seenWords.add(w);}}
        return true;
    }
}
public class wordPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine();
        String s = sc.nextLine();
        InnerwordPattern i = new InnerwordPattern();
        System.out.println(i.wordpattern(pattern, s));
        sc.close();
    }
}
