public class RotateAnArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=2,temp,j=0,i=0;
        while(j<n){
            temp=arr[0];
        for(i=0;i<arr.length;i++){
            if(i+1<arr.length){
                arr[i]=arr[i+1];
            }
        }
        arr[i-1]=temp;
        j++;
    }
    for(int k=0;k<arr.length;k++){
        System.out.println(arr[k]);
    }
    }
}
