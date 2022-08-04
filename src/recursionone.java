import javax.naming.NoInitialContextException;

class recursionone{
    
    public static void main(String[] args) {
        
        System.out.println(powNum(2,5));
    }
    //Sum Of Natural Number Recursion
    public static void num(int i,int n,int sum){
        if(i==n){
        sum+=i;
        System.out.println(sum);
        return ;
        }
        sum+=i;   
        num(i+1, n, sum); 
    }  
    // Factorial Of Number Recursion
    static int calacfactorial(int n){
        if(n==1){
            return 1;
        }
        n=n*calacfactorial(n-1);
        return n;
        
    }
    //Fibonacci Sequences
    public static void printFb(int a,int b,int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFb(b, c, n-1);
    }
    // Calculate X to the power n (Where Stack Height Is Equal to n)
    static int numPow(int num,int pow){
        if(pow ==0){
            return 1;
        }
        if (num==0){
            return 0;
        }
        num*=numPow(num, pow-1);
        return num;
    }
    // Calculate X to the power n (where Stack height is equal to n)
    static int powNum(int num,int pow){
        if(pow ==0){
            return 1;
        }
        if (num==0){
            return 0;
        }
        if(pow%2==0){
            return powNum(num, pow/2)*powNum(num, pow/2);
        }
        else{
            return powNum(num, pow/2)*powNum(num, pow/2)*num;
        }

    }
}                                                                                                                                                                                                                                                                              