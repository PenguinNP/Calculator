public class printpremutationstring {
	public static  void allComb(String str,String combination){
		if(str.length()==0){
			System.out.println(combination);
			return;
		}		for(int i=0;i<str.length();i++){
			char currChar=str.charAt(i);
			String newStr=str.substring(0,i)+str.substring(i+1);
			allComb(newStr,combination+currChar);
		}
	}

	public static void main(String[] args) {
		allComb("abc","");
	}
}
