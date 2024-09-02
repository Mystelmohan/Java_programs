import java.util.Arrays;

/**
 * DuplicateNumber
 */
public class DuplicateNumber {

    public static void main(String[] args) {
        int arr[]={1,3,2,4,2,5};
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                System.out.println(arr[i]);
                break;
            }
                     
        }

    }
}