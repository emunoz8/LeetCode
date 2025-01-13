import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII{

    //optimal solution********************************************
    public static List<Integer> optimalGetRow(int numRows){
        List<Integer> rVal = new ArrayList<>();
        long temp = 1;
        rVal.add(1);

        for(int i=1, n = numRows, m=1; i <= numRows; i++,n--,m++){
            temp = temp * n / m;
            rVal.add((int)temp);

        }
        return rVal;
    }
    //**************************************************************




    //second attempt, first attempt was overflowing the int values
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> returnVal = new ArrayList<>();
        List<Integer> row = new ArrayList<>();

        row.add(1);
        returnVal.add(row);

        for(int i = 0; i < numRows; i++){
            List<Integer> current = new ArrayList<>();
            int j =1;
            current.add(0, 1);
            for(; j < row.size(); j++ )
                current.add(j, row.get(j-1) + row.get(j));
            current.add(1);
            row = current;
            returnVal.add(row);
            
        }
        return returnVal;
    }

    public static List<Integer> getRow(int rowIndex){
        List<List<Integer>> triangle = generate(rowIndex);
        
        return triangle.get(rowIndex); 
        

    }




}