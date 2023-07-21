//gcd of two number
public class main{
    public static void main(String args[]){
        int a = 123; //input 1
        int b = 12; //input 2
       int r = 0;
        int q = 0;
        int s,t;
        int s1 = 1;
        int s2= 0;
        int t1 =0;
        int t2 = 1;
        while(a!=0 && b!= 0){
            r = a % b;
            q = a / b;
            s = (s1-s2 * q);
            t = (t1-t2* q);
            
            a = b;
            b = r;
            
            s1 = s2;
            s2 = s;
            
            t1 = t2;
            t2 = t;
            
            System.out.println(s1 + " " + s2);
        }
        System.out.println(a + " " + b);
    }
}
