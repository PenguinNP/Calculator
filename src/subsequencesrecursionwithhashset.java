import java.util.HashSet;

public class subsequencesrecursionwithhashset {
	public static void subsequenceWithHash(String str, int index, String newStr, HashSet<String> set){
		if(index==str.length()){
			if(set.contains(newStr)){
				return;
			}
			else{
				System.out.println(newStr);
				set.add(newStr);
				return;
			}
		}
		char currchar=str.charAt(index);
		subsequenceWithHash(str,index+1,newStr+currchar,set);
		subsequenceWithHash(str,index+1,newStr,set);
	}

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		subsequenceWithHash("aaa",0,"",set);
	}
}
