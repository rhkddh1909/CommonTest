package EnssentialTest;

import java.util.Arrays;

public class WinningPoint {
    public int winningPoint(String[] games){
        return Arrays.stream(games).mapToInt(item->item.charAt(0)-'0' > item.charAt(2)-'0' ? 3 : item.charAt(0)-'0' == item.charAt(2)-'0' ? 1 : 0).sum();
    }
}
