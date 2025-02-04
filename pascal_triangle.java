import java.util.List;
import java.util.ArrayList;
public class pascal_triangle {
    public static void main(String[] args) {
        pascal_triangle p=new pascal_triangle();
        System.out.println("Test cases for number of rows 5, 3, 7:");
        System.out.println(p.generate(5));
        System.out.println(p.generate(3));
        System.out.println(p.generate(7));

    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> r = new ArrayList<>();

        for (int i=0;i<numRows;i++) {
            List<Integer> row = new ArrayList<>();
            for (int j=0;j<=i;j++) {
                if (j==0 || j==i) {
                    row.add(1);
                }
                else {
                    row.add(r.get(i-1).get(j-1) + r.get(i-1).get(j));
                }
            }
            r.add(row);
        }
        return r;
    }


}
