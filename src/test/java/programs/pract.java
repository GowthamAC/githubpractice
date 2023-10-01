package programs;

import java.util.HashMap;

public class pract {
	public static void main(String[] args) {
   int [] a= {1,2,3,4,1,2,3,7,8};
   HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
   for (int i = 0; i < a.length; i++) {
	map.put(a[i], map.getOrDefault(a[i], 0) +1);
}
   //map.forEach((key,value) -> {System.out.println(key);});
   
	}
}
