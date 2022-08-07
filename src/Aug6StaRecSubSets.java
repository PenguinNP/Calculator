import java.util.ArrayList;

public class Aug6StaRecSubSets {
	public static void printf(ArrayList<Integer> subset){
		for(int a :subset){
			System.out.print(a+" ");

		}
		System.out.println();
	}
	public static void subSets(int number,ArrayList<Integer> subset){
		if(number==0){
			printf(subset);
			return;
		}

		subset.add(number);
		subSets(number-1,subset);
		subset.remove(subset.size()-1);
		subSets(number-1,subset);
	}
	public static void main(String[] args) {
		ArrayList<Integer> subset = new ArrayList<>();
		subSets(3,subset);

	}
}
