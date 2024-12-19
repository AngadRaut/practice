package java_9;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

interface Demo{
    default int addEvenNo(int... nums){
        return add(a->a%2==0,nums);
    }
    default int addOddNo(int... nums){
        return add(a->a%2!=0,nums);
    }
    private static int add(IntPredicate predicate,int... nums){
        return IntStream.of(nums).filter(predicate).sum();
    }
}
public class PrivateMethodEx implements Demo{
    public static void main(String[] args) {
        Demo demo = new PrivateMethodEx();
        int evenNoSum = demo.addEvenNo(1,4,6,6,3,8,7,5,4,67,99);
        int oddNoSum  = demo.addOddNo(8,9,9,5,2,5,6);
        System.out.println("addition of even no is = "+evenNoSum);
        System.out.println("addition of odd no is = "+oddNoSum);
    }
}
