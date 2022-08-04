public class recursionRevOfString {
    public static void print(int index,String word){
        if(index==0){
            System.out.print(word.charAt(index));
            return;
        }
        System.out.print(word.charAt(index));
        print(index-1, word);
    }
    public static void main(String[] args) {
        String word ="Utshav";
        print(word.length()-1, word);
    }
    
}
