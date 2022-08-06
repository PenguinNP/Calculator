public class keyPad {
	public  static  String[] keypadkeys={".","abd","def","ghi","jkl","mon","pqrs","tu","vwx","yz"};
	public static  void printcomb(String str,int index,String Combination){
		if(index==str.length()){
			System.out.println(Combination);
			return;
		}
		char currChar = str.charAt(index);
		String mapping = keypadkeys[currChar-'0'];
		for (int i=0;i<mapping.length();i++){
			printcomb(str,index+1,Combination+mapping.charAt(i));
		}
	}

	public static void main(String[] args) {
		printcomb("56 ",0,"");
	}

}
