import org.omg.CORBA.SystemException;

/**
 * Created by bruce on 2017/4/11.
 */
public class LengthEncoding {

    public static void main(String[] args) {
        String a = "wwwwwwwwddfxxeeeeede";
        System.out.println(a);
        System.out.println(run(a));
    }

    public static String run(String a) {
        String result = "";

        for(int i = 0, j = 0, n = a.length();i < n;j++) {
            if(a.charAt(i)!=a.charAt(j)){
                result = result + a.charAt(i) + Integer.toString(j-i);
                i = j;
            }
            if(j==n-1){
                result = result + a.charAt(i) + Integer.toString(j-i+1);
                break;
            }
        }
        return result;
    }
}
