import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator; 

public class Extract_num_from_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        String arr[]=new String[num];
        for(int i=0;i<num ;i++){
            arr[i] = sc.nextLine();
        }
        for(int j=0;j<num;j++){
        ArrayList<String> a1 = new ArrayList<String>();
        String res = "";
        for (int i = 0; i <  arr[j].length(); i++) {
            if (Character.isDigit(arr[j].charAt(i))) {
                res += (arr[j].charAt(i));
               
                if (i == arr[j].length() - 1 || !Character.isDigit(arr[j].charAt(i + 1))) {
                    a1.add(res);
                    res = "";
                }
            }
        }
        int max = 0;
      
        Iterator<String> its = a1.iterator();
        while (its.hasNext()) {
           
            int a = Integer.parseInt(its.next());
            if (max < a) {
                max = a;
            }
        }
        System.out.println(max);
    }
        sc.close();
    }
}