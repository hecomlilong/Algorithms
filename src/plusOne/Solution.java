package plusOne;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by bruce on 2017/4/1.
 */
public class Solution {
    public static Vector<Integer> plusOne(Vector<Integer> digits) {
        Vector<Integer> res = new Vector<>(digits);

        int sum;
        int one = 1;
        for(int i = digits.size() - 1; i >= 0; i--) {
            sum = one + digits.get(i);
            one = sum / 10;
            res.set(i, sum % 10);
            if(one == 0){
                break;
            }
        }
        if(one > 0) {
            res.add(0,one);
        }
        return res;
    }

    public static void main(String[] args) {
        Vector<Integer> test = new Vector<>(10,1);
        test.add(9);
        test.add(9);
        test.add(9);
        test.add(9);
        test.add(9);
        test.add(9);
        test.add(9);
        test.add(9);
        test.add(9);
        test.add(8);
        System.out.println(test.toString());
        Vector<Integer> testAdd = plusOne(test);
        System.out.println(testAdd.toString());

        ArrayList<Integer> test2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));

        System.out.println(test2.toString());

        ArrayList<Integer> test2add = plusOne(test2);

        System.out.println(test2add.toString());


        //test start
        long t1 = System.currentTimeMillis();

        // ... Add to ArrayList.
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            a.add(i);
        }

        long t2 = System.currentTimeMillis();

        // ... Add to Vector.
        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < 10000000; i++) {
            v.add(i);
        }

        long t3 = System.currentTimeMillis();

        // ... Times.
        System.out.println(t2 - t1);
        System.out.println(t3 - t2);
        //test end

    }

    public static ArrayList<Integer> plusOne(ArrayList<Integer> digits) {
        ArrayList<Integer> res = new ArrayList<>(digits);
        int one = 1;
        int sum;
        for(int i = digits.size() - 1; i >= 0; i--) {
            sum = one + digits.get(i);
            one = sum / 10;
            res.set(i,sum % 10);
        }

        if(one > 0){
            res.add(0,one);
        }
        return res;
    }

}
