public class recursionTOH {
    public static void towerOfHanoi(int n , String src,String Helper,String Dest){
        if(n==1){
            System.out.println("Disk "+n+" Transfer From "+src+" To "+Dest);
            return;
        }
        towerOfHanoi(n-1, src, Dest, Helper);
        System.out.println("Disk "+n+" Transfer From "+src+" To "+Dest);
        towerOfHanoi(n-1, Helper, src, Dest);
    }
    public static void main(String[] args) {
        towerOfHanoi(7, "Source", "Helper", "Dest");
    }
}
