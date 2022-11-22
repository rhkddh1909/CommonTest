package OptionalTest;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class FindFriend {
    public String[] findFriend(String[] users){
        return Arrays.stream(users).filter(user -> user.length() == 4).collect(Collectors.toList()).toArray(String[]::new);
    }
}
