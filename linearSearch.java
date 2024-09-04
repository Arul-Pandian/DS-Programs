import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        int t=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==t){
                System.out.print("yes");
                return;
            }
        }
        System.out.print("no");
    }
}
