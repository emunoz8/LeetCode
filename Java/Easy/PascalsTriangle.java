import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle{

    //optimal solution************************************
    public static List<Integer> generateRow(int n){
        List<Integer> row = new ArrayList<>();
        int num = 1;
        row.add(1);

        for(int i=1; i < n;i++){
            num *= (n-i);
            num /=i;
            row.add(num);
        }
        return row; 
    }

    public static List<List<Integer>> optimalGenrate(int numRows){
        List<List<Integer>> rVal = new ArrayList<>();

        for(int i =1; i <= numRows;i++)
            rVal.add(generateRow(i));

        return rVal;
    }
    //******************************************************
    
    //first attempt
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



}