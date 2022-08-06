public class tileplacementaug6rec {
 public  static int placment(int n,int m){
	 if(n==m){
		 return 2;
	 }
	 if(n<m){
		 return 1;
	 }
	 //horizentally
	 int horizental=placment(n-1,m);
	 //vertically
	 int vertically = placment(n-m,m);
	 return horizental+vertically;
 }

	public static void main(String[] args) {
		System.out.println(placment(4,2));
	}
}
