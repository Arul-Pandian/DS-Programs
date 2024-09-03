import java.lang.Math;
class Main{
    public static void main(String[] args) {
       int n=1749;
       int temp=n;
       int count=0;
       while(temp>0){
           count++;
           temp=temp/10;
       }
       while(n>0){
           int rem=n%((int)Math.pow(10,count-1));
           int t=rem;
           n=n/(int)Math.pow(10,count-1);
           System.out.println(n);
           n=t;
           count--;
       }
       
    }
}
