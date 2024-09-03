
class HelloWorld {
    public static void main(String[] args) {
        int n=153;
        int temp=n;
        int rem=0;
        int a=0;
        while(temp>0){
            rem=temp%10;
            a=a+(rem*rem*rem);
            temp=temp/10;
            
        }
        if(a==n){
            System.out.print("Armstrong");
        }
        else{
            System.out.print("Not Armstrong");
        }
    }
}
