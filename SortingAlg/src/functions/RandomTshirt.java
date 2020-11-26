package functions;

import entities.Tshirt;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import enums.Color;
import enums.Fabric;
import enums.Size;
import sorting.BubbleSortColor;
import sorting.BubbleSortFabric;
import sorting.BubbleSortSize;


public class RandomTshirt extends Tshirt{
    
    private final int totalTshirts = 5; //5 just for now...
    private Random random;
    private BubbleSortSize bsSize = new BubbleSortSize();
    private BubbleSortColor bsColor = new BubbleSortColor();
    private BubbleSortFabric bsFabric = new BubbleSortFabric();
    
    public RandomTshirt() {
        random=new Random();
        this.setName(randomName());
        this.setColor(randomColor());
        this.setSize(randomSize());
        this.setFabric(randomFabric());
    }
    
    public Size randomSize(){
        return Size.values()[random.nextInt(Size.values().length)];
    }
    
    public Color randomColor(){
        return Color.values()[random.nextInt(Color.values().length)];
    }
    
    public Fabric randomFabric(){
        return Fabric.values()[random.nextInt(Fabric.values().length)];
    }
    
    public String randomName(){
        StringBuilder sb = new StringBuilder();
        char[] ch = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
                    'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for (int i = 0; i < 6; i++) {
            sb.append(ch[random.nextInt(ch.length)]);
        }
        return sb.toString();
    }

    public List<Tshirt> randomTshirtListFill(){
        List<Tshirt> tshirtList = new ArrayList(totalTshirts);
        for (int i = 0; i < totalTshirts; i++) {
            tshirtList.add(new RandomTshirt());
        }
        return tshirtList;
    }
// SIZE ORDER -----------------
    public void ascendingSizeOrder(){
        List<Tshirt> tshirtList = bsSize.shorting(randomTshirtListFill(), 0);
        System.out.println("-----------------Ascending Order by Size\n"+tshirtList);
    }
    public void descendingSizeOrder(){
        List<Tshirt> tshirtList = bsSize.shorting(randomTshirtListFill(), 1);
        System.out.println("-----------------Descending Order by Size\n"+tshirtList);
    }
    
// COLOR ORDER -----------------
    public void ascendingColorOrder(){
        List<Tshirt> tshirtList = bsColor.shorting(randomTshirtListFill(), 0);
        System.out.println("-----------------Ascending Order by Color\n"+tshirtList);
    }
    public void descendingColorOrder(){
        List<Tshirt> tshirtList = bsColor.shorting(randomTshirtListFill(), 1);
        System.out.println("-----------------Descending Order by Color\n"+tshirtList);
    }
    
// FABRIC ORDER -----------------
    public void ascendingFabricOrder(){
        List<Tshirt> tshirtList = bsFabric.shorting(randomTshirtListFill(), 0);
        System.out.println("-----------------Ascending Order by Fabric\n"+tshirtList);
    }
    public void descendingFabricOrder(){
        List<Tshirt> tshirtList = bsFabric.shorting(randomTshirtListFill(), 1);
        System.out.println("-----------------Descending Order by Fabric\n"+tshirtList);
    }
}
