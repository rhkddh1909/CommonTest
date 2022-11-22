package OptionalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IQTest {
    public int iqTest(String numbers){
        List<Integer> odd = new ArrayList<Integer>();
        List<Integer> even = new ArrayList<Integer>();
        int[] items = Arrays.stream(numbers.split(" ")).mapToInt(item-> Integer.parseInt(item)).toArray();
        for(int i = 0; i < items.length; i++){
            if(items[i] % 2 == 0) {
                even.add(i + 1);
            }else{
                odd.add(i + 1);
            }
        }
        return even.size() > odd.size() ? odd.get(0) : even.get(0);
    }
}
