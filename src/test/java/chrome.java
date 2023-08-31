import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import org.testng.annotations.Test;

public class chrome {
	@Test
public void m1() {
	String s="yammoyammo";
	char[] ch = s.toCharArray();
  for (int i = 0; i < ch.length; i++) {
	  int count=1;
	for (int j = i+1; j < ch.length; j++) {
		if(ch[i]==ch[j]) {
			ch[j]='@';
			count++;
		}
	}
	if(ch[i]!='@' ) {
		System.out.print(ch[i]+""+count+" ");
	}
}
}
	@Test
	public void m2() {
		String s="yammoyammo";
		char[] ch = s.toCharArray();
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			hmap.put(ch[i], hmap.getOrDefault(ch[i],0)+1);
		}
		for(Entry<Character,Integer> map:hmap.entrySet()) {
			System.out.print(map.getKey()+""+map.getValue()+" ");
		}
	}
	@Test
	public void m3() {
		String s="yammoyammo";
		char[] ch = s.toCharArray();
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			lhs.add(ch[i]);
		}
		for(char c :lhs) {
			int count=1;
			for (int i = 0; i < ch.length; i++) {
				if(c==ch[i]) {
					count++;
				}
			}
			System.out.print(c+""+count+" ");
		}
	}
}