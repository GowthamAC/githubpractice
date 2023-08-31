package practice;

public class program1 {
	public static void main(String[] args) {
		String s = "a!#b*nhm()ii.";
		char[] ch = s.toCharArray();
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(ch[i])) {
				s1 = s.charAt(i) + s1;
			}
		}
		char[] ch1 = s1.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (Character.isAlphabetic(ch[i])) {
				ch[i] = ch1[count++];
			}
		}
		System.out.println(ch);
	}
}
