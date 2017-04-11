package PascalTriangle;

import java.util.Vector;

/**
 * Created by bruce on 2017/4/1.
 */
public class Solution {
    public static Vector<Vector<Integer>> generate(int numRows) {
        Vector<Vector<Integer>> vals = new Vector<>(numRows);

        for(int i = 0; i < numRows; i++) {
            vals.add(i,new Vector<>(i+1));
            vals.get(i).add(0,1);
            vals.get(i).add(vals.get(i).size() - 1,1);
            for(int j = 1; j < vals.get(i).size() - 1; j++) {
                vals.get(i).add(j,vals.get(i-1).get(j-1) + vals.get(i-1).get(j));
            }
        }

        return vals;
    }

    public static void main(String[] args) {
        System.out.println(generate(5).toString());
    }
}
