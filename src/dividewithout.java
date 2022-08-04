public class dividewithout {
    public static void main(String[] args) {
        int dividend =-1;
		int divisor =-1;
		int a = Math.abs(dividend);
    int b = Math.abs(divisor);
    int quo = 0;
    while (a - b >= 0) {
        int x = 0;
        while (a - ((b << 1) << x) >= 0) {
            x++;
        }
        quo += 1 << x;
        a -= b << x;
    }
      if ((dividend >= 0) == (divisor >= 0)) {
        System.out.println(quo);
    } else {
        System.out.println(-1*quo);
    }
	
    }

    
}
