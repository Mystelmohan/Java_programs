public class RightRotate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=2,temp,j=0,i;
        while(j<n){
            temp=arr[arr.length-1];
        for(i=arr.length-1;i>=0;i--){
            if(i-1>=0){
                arr[i]=arr[i-1];
            }
        }
        arr[i+1]=temp;
        j++;
    }
    for(int k=0;k<arr.length;k++){
        System.out.println(arr[k]);
    }
    }
}
