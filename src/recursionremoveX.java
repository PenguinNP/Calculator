public class recursionremoveX {
    public static void removeOfX(String str,int index,int count,String newString) {
        if(index==str.length()){
            for(int i =0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        if(str.charAt(index)=='x'){
            count++;
            removeOfX(str, index+1, count, newString);
        }
        else{
            newString+=str.charAt(index);
            removeOfX(str, index+1, count, newString);
        }
        
    }
    public static void main(String[] args) {
        String str="axbcxxd";
        removeOfX(str, 0, 0, "");
    }
    
}
