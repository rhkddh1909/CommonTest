package OptionalTest;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SecondNum {
    public int secondNum(int[] in){
        return Arrays.stream(in).sorted().boxed().collect(Collectors.toList()).get(1);
    }
}
