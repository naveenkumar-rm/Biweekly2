package biweeklyTest;

public class RearrangeWordsInASentence {

	public static void main(String[] args) { 
		String sentence = "Leetcode makes me happy";
		String result = "\\s+";
		String[] words =sentence.split(result);
		for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - i - 1; j++) {
			if(words[j+1].length()<words[j].length()) {
				String temp =words[j];
				words[j]=words[j+1];
				words[j+1]=temp;
			}
			}
		}
		
		for(String a:words) {
			System.out.print(a+" ");
		}
	}

}
