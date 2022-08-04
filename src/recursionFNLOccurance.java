public class recursionFNLOccurance {
    public static int first=-1;
    public static int last=-1;
    public static void elementOccuramce(String word,int index,char element){
        if(index==word.length()){
            System.out.println(first+" Is the first index of "+element);
            System.out.println(last+" Is the last index of "+element);
            return;
        }
        char current = word.charAt(index);
        if(current==element){
            if(first==-1){
                first=index;
            }
            else{
                last=index;
            }
        }
        elementOccuramce(word, index+1, element);

    }
    public static void main(String[] args) {
        String word="abaachaefaah";
        elementOccuramce(word, 0, 'a');
    }
    
}
