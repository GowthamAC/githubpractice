package practice;

import java.util.Iterator;

public class program2 {
public static void main(String[] args) {
   int [] a= {1,3,4,5,8};
   int [] b= {2,4,6,7,9,10};
   int length=a.length;
   if(b.length>a.length) {
	   length=b.length;
   }
   
  
	for (int i = 0; i < length; i++) {
		try {
		int c=a[i]+b[i];
		System.out.print(c+" ");
	
} catch (Exception e) {
	if(a.length>b.length) {
	System.out.print(a[i]+" ");
}else {
	System.out.print(b[i]+" ");
}
	}
}
}
}