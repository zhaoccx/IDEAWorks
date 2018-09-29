package cn.com.zcc.calculation;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 简单的复利计算
 */
public class Calculation {


    /**
     * 迭代法
     *
     * @param init      初始华
     * @param rate      利率
     * @param year      年份
     * @param doublemap 数据
     * @return 目标金额
     */
    double getCalcs(double init, double rate, int year, Map<String, Double> doublemap) {
        if (year <= 0) {
            return init;
        }

        if (year > 1) {
            doublemap.put(String.valueOf(year), getCalcs(init, rate, year - 1, doublemap) * (100 + rate) / 100);
            System.out.println("第" + year + "年的本息共" + getCalcs(init, rate, year - 1, doublemap));
            return getCalcs(init, rate, year - 1, doublemap) * (100 + rate) / 100;
        }
        doublemap.put(String.valueOf(year), init + init * rate / 100);

        return init + init * rate / 100;
    }


    public Map<String, Double> getAverage(Map<String, Double> initMap) {
        for (Map.Entry<String, Double> entry : initMap.entrySet()) {
            if ("1.0".equals(entry.getKey())) {
                System.out.println("ssssssssssssssssssssssssss");
                initMap.put(entry.getKey(), 9000D / 15);
            } else {

                System.out.println(entry.getKey());
                //initMap.put(entry.getKey(), (initMap.get(entry.getKey()) - initMap.get(String.valueOf(Double.valueOf(entry.getKey()) - 1.0D))) / 15);


            }
        }
        return initMap;
    }

    /**
     * 循环法
     *
     * @param init      初始化金额
     * @param rate      利率
     * @param year      年份
     * @param doublemap 保存相关信息。
     * @return 结果
     */
    public double Calcsforeach(Double init, Double rate, int year, Map<Integer, Salarys> doublemap) {
        //  doublemap.put(0,new Salarys(0,init,0D));

        for (int i = 1; i <= year; i++) {


            doublemap.put(i, new Salarys(i, init * rate / 100 + init, 10, init));
            init += init * rate / 100;

        }


        return init;
    }

    /**
     * 循环法
     *
     * @param init 初始化金额
     * @param rate 利率
     * @param year 年份
     * @return 数据map
     */
    public Map<Integer, Salarys> getMapCalcsforeach(Double init, Double rate, int year) {
        Map<Integer, Salarys> doublemap = new ConcurrentHashMap<>();
        for (int i = 1; i <= year; i++) {


            doublemap.put(i, new Salarys(i, init * rate / 100 + init, 10, init));
            init += init * rate / 100;

        }


        return doublemap;
    }
}
