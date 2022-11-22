package EnssentialTest;

import java.util.Arrays;

public class PlusMinus {
    public String plusMinus(int n){
        String[] answerArr = {"kiwi","pear","kiwi","banana","melon","banana","melon","pineapple","apple"};
        String strNum = n+"";

        while(strNum.length() > 1){
            int sum = 0;
            char[] chArr = strNum.toCharArray();
            for(int i = 0; i < chArr.length; i++){
                sum += chArr[i]-'0';
            }
            strNum = (Integer.parseInt(strNum)-sum)+"";
        }

        return answerArr[strNum.charAt(0)-'1'];
    }
}
