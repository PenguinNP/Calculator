public class Aug7SunBackOne {
	public static  void permu(String str,String newStr,int index){
		if (str.length()==0){
			System.out.println(newStr);
			return;
		}
		for(int i =0;i<str.length();i++){
			char currChar=str.charAt(i);
			String Str=str.substring(0,i)+str.substring(i+1);
			permu(Str,newStr+currChar,index+1);
		}
	}

	public static void main(String[] args) {
		permu("abc","",0);
	}
}
