import java.lang.Math;
class HelloWorld {
    public static void main(String[] args) {
        int n=407;
        int temp=n;
        int num = temp;
        int c=0,rem=0;
        while(temp>0){
            c++;
            temp=temp/10;
        }
        int sum=0;
        while(num >0){
            rem=num%10;
            sum=sum+(int)Math.pow((double)rem,(double)c);
            num=num/10;
        }
       if(sum==n){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not an Armstrong");
        }
        
    }
}
