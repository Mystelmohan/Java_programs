/**
 * AugusticsValues
 */
import java.util.*;
public class AugusticsValues {

    public static void main(String[] args) {
        String s="125";
        int res=0;
        for (int i = 1; i < s.length(); i++) {
            int firstPart = Integer.parseInt(s.substring(0, i));
            int secondPart = Integer.parseInt(s.substring(i));
            res += firstPart + secondPart;
        }
        int ans=Integer.parseInt(s);
        res+=ans;
        while(ans>0){
            res+=(ans%10);
            ans/=10;
        }
        System.out.println(res);
    }
}
