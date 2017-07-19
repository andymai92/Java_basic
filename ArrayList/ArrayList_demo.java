// Author: Anh N Mai (Andy)
// San Jose - California
import java.util.ArrayList;

public class ArrayList_demo {

	public static ArrayList<String> buildArray(String[] words, String[] extend) {
		ArrayList<String> sentence = new ArrayList<String>();
		for (String w : words)
			sentence.add(w);
		for (String w : extend)
			sentence.add(w);
		return sentence;

	}

	public static void main(String[] args) {
		String[] words = new String[5];
		String[] extend = new String[5];
		for (int i = 0; i < words.length; i++)
			words[i] = "A" + i;
		for (int j = 0; j < extend.length; j++)
			extend[j] = "B" + j;
		ArrayList<String> sentence = buildArray(words, extend);
		System.out.println(sentence);

	}

}
