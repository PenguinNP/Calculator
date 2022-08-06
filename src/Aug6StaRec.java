public class Aug6StaRec {
	// Number Of Ways To Call Guest at party
	public static int waysCall(int num){
		if(num<=1){
			return 1;
		}
		//To call them single
		int single=waysCall(num-1);
		//To call Them in Pair
		int inPair=(num-1)*waysCall(num-2);
		return single+inPair;
	}

	public static void main(String[] args) {
		System.out.println(waysCall(3));
	}

}
