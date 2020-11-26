package sorting;

import entities.Tshirt;
import java.util.ArrayList;
import java.util.List;


public class BubbleSortColor implements IBubbleSort{

    @Override
    public List<Tshirt> shorting(List<Tshirt> arr, int order) {
        List<Tshirt> arr2 = new ArrayList<>(arr);
        int n = arr2.size(); 
        switch(order) {
            case 0:
                for (int i = 0; i < n-1; i++) 
                    for (int j = 0; j < n-i-1; j++) 
                        if (arr2.get(j).getColor().ordinal() > arr2.get(j+1).getColor().ordinal()) 
                        {
                            Tshirt temp = arr2.get(j); 
                            arr2.set(j, arr2.get(j+1));
                            arr2.set(j+1, temp);
                        }
                break;
            case 1:
                for (int i = 0; i < n-1; i++) 
                    for (int j = 0; j < n-i-1; j++) 
                        if (arr2.get(j).getColor().ordinal() < arr2.get(j+1).getColor().ordinal()) 
                        {
                            Tshirt temp = arr2.get(j); 
                            arr2.set(j, arr2.get(j+1));
                            arr2.set(j+1, temp);
                        }
                break;
        }
        return(arr2);
    }

    
    
}
