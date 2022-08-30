public class Maximum_Number_of_Words_Found_in_Sentences_2114 {
    public static void main(String[] args) {
        System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
    }

    public static int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for(int i=0; i<sentences.length; i++){
            String[] words = sentences[i].split("\\s+");
            if(maxCount < words.length){
                maxCount = words.length;
            }
            System.out.println(words.length);
        }
        return maxCount;
    }
}
