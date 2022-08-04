public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb.charAt(0));//it will print the character at the index n
        sb.setCharAt(0, 'P');//Tony changes Into Pony
        System.out.println(sb);
        sb.insert(2, 'e');//Pony will change into Poeny
        System.out.println(sb);
        sb.delete(1, 3);//Poeny will change into Pny
        System.out.println(sb);
        sb.append('A');//it will add A at Pny ,PnyA
        System.out.println(sb);

    }
    
}
