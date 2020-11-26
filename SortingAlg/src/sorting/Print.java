package sorting;

import java.util.List;

//NOT NEEDED...LEAVE IT BE
public class Print {

    public void printArray(List<Integer> arr) 
    { 
        int n = arr.size(); 
        for (int i=0; i<n; ++i) 
            System.out.print(arr.get(i) + " "); 
        System.out.println(); 
    } 
}
