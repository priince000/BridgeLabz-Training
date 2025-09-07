public class replacer {

    public static String replaceWord(String sentence, String target, String replacement) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                result.append(replacement);
            } else {
                result.append(words[i]);
            }

            if (i != words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        String target = "fox";
        String replacement = "cat";

        String replacedSentence = replaceWord(sentence, target, replacement);
        System.out.println(replacedSentence);
    }
}
