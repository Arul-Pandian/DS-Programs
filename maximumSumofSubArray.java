// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static int maxSum(int a[],int n,int k){
        int maxsum=0;
        if(n<=k){
            System.out.print("Invalid");
            return -1;
        }
        for(int i=0;i<k;i++){
            maxsum+=a[i];
        }
        int windowsum=maxsum;
        for(int i=k;i<n;i++){
            windowsum+=a[i]-a[i-k];
            maxsum=Math.max(windowsum,maxsum);
        }
        return maxsum;
        
        
    }
    public static void main(String[] args) {
        int ar[]={1,3,6,2,4,8,2};
        int n= ar.length;
        System.out.print(maxSum(ar,n,4));
        
    }
}
