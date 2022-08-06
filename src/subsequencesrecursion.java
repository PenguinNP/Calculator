public class subsequencesrecursion {
	public  static  void subsequnces(String str,int index,String newstr){
		if(index==str.length()){
			System.out.println(newstr);
			return;
		}
		char currchar=str.charAt(index);
		subsequnces(str,index+1,newstr+currchar);
		subsequnces(str,index+1,newstr);
	}

	public static void main(String[] args) {
		subsequnces("abc",0,"");
	}
}
