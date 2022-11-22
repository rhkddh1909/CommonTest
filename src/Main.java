import EnssentialTest.PlusMinus;
import EnssentialTest.Quarter;
import EnssentialTest.UnUseSmallestNum;
import EnssentialTest.WinningPoint;
import OptionalTest.FindFriend;
import OptionalTest.FindVowel;
import OptionalTest.IQTest;
import OptionalTest.SecondNum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //System.out.println(new Quarter().quarter(12));
//        int[] a = {0,1,2,4};
//        int[] b = {0,1,2,3,4,5,6};
//        int[] c = {0,1,2,2,3,3,4,6};
//        System.out.println(new UnUseSmallestNum().unUseSmallestNum(a));
//        System.out.println(new UnUseSmallestNum().unUseSmallestNum(b));
//        System.out.println(new UnUseSmallestNum().unUseSmallestNum(c));
//        String[] games = {"3:1","2:2","1:3"};
//        System.out.println(new WinningPoint().winningPoint(games));
//        for(int i = 10; i <= 10000; i++){
//            System.out.println(new PlusMinus().plusMinus(10));
//        }
//        System.out.println(new FindVowel().findVowel("aeiou"));
//        int[] a = {0,1,2};
//        int[] b = {5,1,2};
//        System.out.println(new SecondNum().secondNum(a));
//        String[] strArr = {"Ryan", "Kieran", "Mark"};
//        Arrays.stream(new FindFriend().findFriend(strArr)).forEach(item->System.out.println(item));
        System.out.println(new IQTest().iqTest("2 4 7 8 10"));
        System.out.println(new IQTest().iqTest("1 2 1 1"));
    }
}