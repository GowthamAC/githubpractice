
public class chrome {
public static void main(String[] args) {
int[] a= {1,3,5,7,9};
int[] b= {2,4,6,8,10,12};
int length=a.length+b.length;
int [] c=new int[length];
int i=0;
int j=0;
while(i<a.length && i<b.length) {
	c[j]=a[i];
	j++;
	c[j]=b[i];
	i++;
	j++;
}
while(i<a.length) {
	c[j]=a[i];
	i++;
	j++;
}
while(i<b.length) {
	c[j]=b[i];
	i++;
	j++;
}
for (int j2 = 0; j2 < c.length; j2++) {
	System.out.print(c[j2]+" ");
}
}
}
