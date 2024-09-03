
class HelloWorld {
    public static void main(String[] args) {
        int n=541;
        int temp=n;
        int rem=0;
        int rev=0;
        while(temp>0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
            
        }
        if(rev==n){
            System.out.print("Armstrong");
        }
        else{
            System.out.print("Not Armstrong");
        }
    }
}
