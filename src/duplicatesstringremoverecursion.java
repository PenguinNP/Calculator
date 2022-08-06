public class duplicatesstringremoverecursion {
    public static boolean[] check = new boolean[26];
    public  static void removeString(String str,int index,String newStr){
        if(index==str.length()){
            System.out.println(newStr);
            return;
        }
        char currentchar=str.charAt(index);
        if(check[currentchar-'a']){
            removeString(str,index+1,newStr);
        }
        else{
            newStr+=currentchar;
            check[currentchar-'a']=true;
            removeString(str,index+1,newStr);
        }
    }
    public static void main(String[] args) {
        removeString("aabcadefe",0,"");

    }
}
