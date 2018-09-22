package cn.com.zcc.calculation;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Calculation {

    public static void main(String[] args) {
        System.out.println("OK-----Start");
        Map<Double, Double> concurrentHashMap = new ConcurrentHashMap<Double, Double>();
        double calcs = new Calculation().getCalcs(45000, 20, 5, concurrentHashMap);
        System.out.println("计算结果为："+calcs);
        System.out.println(concurrentHashMap);
        System.out.println("计算结果为："+new Calculation().getAverage(concurrentHashMap));

        System.out.println("OK-----End");

    }

    public double getCalcs(double init, double rate, double year, Map<Double, Double> doublemap){
        if (year<=0){
            return init;
        }

        if (year>1){
            doublemap.put(year,getCalcs(init,rate,year-1, doublemap)*(100+rate)/100);
            System.out.println("第"+year+"年的本息共"+getCalcs(init,rate,year-1, doublemap));
            return getCalcs(init,rate,year-1, doublemap)*(100+rate)/100;
        }
        doublemap.put(year,init+init*rate/100);

        return  init+init*rate/100;
    }


    public Map<Double,Double> getAverage(Map<Double,Double> initMap){
        for (Map.Entry<Double, Double> entry : initMap.entrySet()) {
            if (entry.getKey() == 1.0) {
                System.out.println("ssssssssssssssssssssssssss");
                initMap.put(entry.getKey(), 9000D / 15);
            }else {
                // TODO entry.getKey()是double比较的问题..................
                initMap.put(entry.getKey(), (initMap.get(entry.getKey()+1.0D) - initMap.get(entry.getKey()) )/ 15);


            }
        }
        return initMap;
    }
}
