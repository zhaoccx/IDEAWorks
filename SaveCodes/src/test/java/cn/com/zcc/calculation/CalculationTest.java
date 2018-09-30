package cn.com.zcc.calculation;

import org.junit.Test;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CalculationTest {

    @Test
    public void testGetCalcs() {
        System.out.println("OK-----Start");
        Map<String, Double> concurrentHashMap = new ConcurrentHashMap<>();
        double calcs = new Calculation().getCalcs(45000, 20, 2, concurrentHashMap);
        System.out.println("计算结果为：" + calcs);
        System.out.println(concurrentHashMap);
        System.out.println("计算结果为：" + new Calculation().getAverage(concurrentHashMap));

        System.out.println("OK-----End");

    }

    private Map<Integer, Salarys> testCalcsforeach() {
        Calculation calculation = new Calculation();
        Map<Integer, Salarys> hashMap = new ConcurrentHashMap<>();


        calculation.Calcsforeach(45000D, 20D, 50, hashMap);
//        System.out.println("总金额为这个？"+calcsforeach);
//        System.out.println(hashMap);

        for (Map.Entry<Integer, Salarys> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + "---本金总额------>>" + entry.getValue().getAllSalarys() + "  当年总利息------" + entry.getValue().getInterest());
            System.out.println(entry.getValue());
        }
        return hashMap;
    }

    @Test
    public void testCalcsforeachOther() {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(0);//这里是小数位

        Map<Integer, Salarys> map = new Calculation().getMapCalcsforeach(30000D, 20D, 60);
        List<Double> list = new ArrayList<>();

        for (Map.Entry<Integer, Salarys> entry : map.entrySet()) {
            Salarys value = entry.getValue();
            for (int i = 1; i <= value.getAverageMenthy(); i++) {
                list.add(value.getInitSalary() + i * value.getAverageSalary());
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                System.out.println((i + 1) + "\t" + df.format(list.get(i)) + "\t" + df.format(list.get(1) - list.get(0)));
            } else {
                System.out.println((i + 1) + "\t" + df.format(list.get(i)) + "\t" + df.format(list.get(i) - list.get(i - 1)));

            }
        }
//        System.out.println(list);
    }

}
