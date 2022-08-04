public class lastwordsame {
    public static void main(String[] args) {
        String[] srt={"Andorra","Argentina","Czech Republic","Nepal","Seychelles"};
        int Country=0;
        for (String a :srt){
            char[] con = a.toCharArray();
            Character t=con[0];
            Character y = con[con.length-1];
            if(Math.abs(t.compareTo(y))==32){
                Country++;
            }
        }
        System.out.println(Country);
    }
    
}
