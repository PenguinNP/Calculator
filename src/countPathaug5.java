public class countPathaug5 {

	public static int countPath(int i,int j,int m,int n){
		if(i==m||j==n){

			return 0;
		}
		if(i==m-1&&j==n-1){
			return 1;
		}
		//to go down
		int down=countPath(i+1,j,m,n);

		//to go right
		int right =countPath(i,j+1,m,n);

		return down+right;
	}

	public static void main(String[] args) {
		int a=countPath(0,0,3,3);
		System.out.println(a);
	}
}
