package cn.com.zcc.calculation;

import org.junit.Before;
import org.junit.Test;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CalculationTest {

    private Double initSalary = 10931D;
    private Double initRate = 5D;
    private int initYear = 5;

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
        // 20181008->31112
        // 20181025->16110，
        // 20200812->

        Map<Integer, Salarys> map = new Calculation().getMapCalcsforeach(5000, 20D, 50);
        List<Double> list = new ArrayList<>();

        for (Map.Entry<Integer, Salarys> entry : map.entrySet()) {
            Salarys value = entry.getValue();
            for (int i = 1; i <= value.getAverageMenthy(); i++) {
                list.add(value.getInitSalary() + i * value.getAverageSalary());
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                System.out.println((i + 1) + "\t\t" + df.format(list.get(i)) + "\t\t\t\t" + df.format(list.get(1) - list.get(0)));
            } else {
                System.out.println((i + 1) + "\t\t" + df.format(list.get(i)) + "\t\t\t\t" + df.format(list.get(i) - list.get(i - 1)));

            }
        }
//        System.out.println(list);
    }


    @Test
    public void testCalcsTime() {
        String string = "5年7个月";
        String[] years = string.split("年");
        String[] months = years[1].split("个");

//        int yes = 0-Integer.valueOf(years[0])
//        System.out.println(Integer.getInteger(years[0]));
//        System.out.println(Integer.getInteger(months[0]));
        Calendar my = Calendar.getInstance();
        my.add(Calendar.YEAR, -Integer.valueOf(years[0]));
        my.add(Calendar.MONDAY, -Integer.valueOf(months[0]));
        System.out.println(my.get(Calendar.YEAR) + "年" + my.get(Calendar.MONDAY) + "月");

    }

    @Test
    public void testCal() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 10);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.YEAR) + "-" + (calendar.get(Calendar.MONDAY) + 1) + "-" + calendar.get(Calendar.DAY_OF_MONTH));

    }

    /**
     * TODO 这个常常用来计算的。
     */
    @Test
    public void testCalcsforeachOtherAverage() {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(0);//这里是小数位
        // 20181008->31112
        // 20181025->16110，
        // 20200812->9803
        Double initSalary = 10931D;
        Double initRate = 5D;
        int initYear = 5;
        int initAverage = 1;
        Map<Integer, Salarys> map = new Calculation().getMapCalcsforeach(initSalary, initRate, initYear, initAverage);
        List<Double> list = new ArrayList<>();

        for (Map.Entry<Integer, Salarys> entry : map.entrySet()) {
            Salarys value = entry.getValue();
            for (int i = 1; i <= value.getAverageMenthy(); i++) {
                list.add(value.getInitSalary() + i * value.getAverageSalary());
            }
        }

        Calendar instance = Calendar.getInstance();
//        instance.set(Calendar.DAY_OF_MONTH, 6);
        for (int i = 0; i < list.size(); i++) {
            if (6 == instance.get(Calendar.DAY_OF_WEEK)) {
                instance.add(Calendar.DAY_OF_MONTH, 3);
            } else {
                instance.add(Calendar.DAY_OF_MONTH, 1);
            }
            if (i == 0) {
                System.err.println((i + 1) + ": " + decimalFormat.format(list.get(i)) + " 【" + decimalFormat.format(list.get(1) - list.get(0)) + "】 " + instance.get(Calendar.YEAR) + "-" + (instance.get(Calendar.MONDAY) + 1) + "-" + instance.get(Calendar.DAY_OF_MONTH));
            } else {
                System.err.println((i + 1) + ": " + decimalFormat.format(list.get(i)) + " 【" + decimalFormat.format(list.get(i) - list.get(i - 1)) + "】 " + instance.get(Calendar.YEAR) + "-" + (instance.get(Calendar.MONDAY) + 1) + "-" + instance.get(Calendar.DAY_OF_MONTH));
            }
        }
//        System.out.println(list);OK
    }

    /**
     * 新的计算方法，希望能永恒下去
     */
    @Test
    public void newCalculationSalary(){
        Double initSalary = 10931D;
        Double initRate = 4D;
        int initYear = 2;
        BaseSalary baseSalary = new BaseSalary(initSalary, initRate);
        CalculationSalary calculationSalary = new CalculationSalary();
        List<BaseSalary> list = calculationSalary.calculationSalaryInit(baseSalary, initYear);
        calculationSalary.printListBaseSalary(list);
    }
}
