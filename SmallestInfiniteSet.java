import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmallestInfiniteSet {
    private List<Integer> positiveIntegers;

    public SmallestInfiniteSet() {
        this.positiveIntegers = new ArrayList<>();
        for(int i=1; i<2000; i++){
            positiveIntegers.add(i);
        }
    }

    public int popSmallest() {
        int a = positiveIntegers.get(0);
        positiveIntegers.remove(0);
        return a;
    }

    public void addBack(int num) {
        if(!positiveIntegers.contains(num)){
            positiveIntegers.add(num);
            Collections.sort(positiveIntegers);
        }
    }
}
