package Q1;

import java.util.*;

public class FloatListSum {
    public static void main(String[] args) {
        List<Float> floatList=new ArrayList<>();
        floatList.add(10.5f);
        floatList.add(20.25f);
        floatList.add(5.75f);
        floatList.add(15.0f);
        floatList.add(8.45f);
        float sum=0.0f;
        Iterator<Float> iterator=floatList.iterator();
        while (iterator.hasNext()){
            sum+=iterator.next();
        }
        System.out.println("Sum of floating ponint numbers are:"+sum);
    }

}
