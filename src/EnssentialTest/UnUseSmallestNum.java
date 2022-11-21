package EnssentialTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UnUseSmallestNum {
    public int unUseSmallestNum(int[] ids){
        Arrays.sort(ids);
        return Optional.of(IntStream.range(0, ids[ids.length - 1])
                .filter(num -> !Arrays.stream(ids).boxed().toList().contains(num))
                .findFirst().orElse(ids[ids.length - 1] + 1)).get();
    }
}
