import java.util.List;
import java.util.ArrayList;
public class spiral_matrix {
    public static void main(String[] args) {
        spiral_matrix s = new spiral_matrix();

        System.out.println("Test cases:");
        int[][] m1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(s.spiralOrder(m1));
        int[][] m2 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        System.out.println(s.spiralOrder(m2));
        int[][] m3 = {{1,2,3,},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
        System.out.println(s.spiralOrder(m3));
    }
    public List<Integer> spiralOrder (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rowStart = 0, rowEnd = matrix.length - 1;
        int colStart = 0, colEnd = matrix[0].length - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) result.add(matrix[rowStart][i]);
            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++) result.add(matrix[i][colEnd]);
            colEnd--;

            if (rowStart <= rowEnd) for (int i = colEnd; i >= colStart; i--)
            result.add(matrix[rowEnd][i]);
        rowEnd--;
        if (colStart <= colEnd) for (int i = rowEnd; i >= rowStart; i--)
            result.add(matrix[i][colStart]);
        colStart++;
    }
        return result;
    }
}
