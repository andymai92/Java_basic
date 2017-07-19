// Author Anh N Mai (Andy)
// San Jose - California
public class StringBuilder {

	public static String makeSentence(String[] words) {
		StringBuffer sentence = new StringBuffer();
		for (String w : words)
			sentence.append(w);
		return sentence.toString();

	}

	public static void main(String[] args) {
		String[] words = new String[5];
		for (int i = 0; i < words.length; i++)
			words[i] = "A" + i;
		System.out.print(makeSentence(words));
	}
}
