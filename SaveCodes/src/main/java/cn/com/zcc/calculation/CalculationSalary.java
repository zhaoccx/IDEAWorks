package cn.com.zcc.calculation;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO 请简单的注释说明类 CalculationSalary 的作用
 *
 * @author zhaocc
 * @date 2020/8/13 15:07
 */
public class CalculationSalary {

    public List<BaseSalary> calculationSalaryInit(BaseSalary baseSalary, Integer year) {
        List<BaseSalary> list = new ArrayList<>();
        list.add(baseSalary);
        BaseSalary nextSalary = new BaseSalary(baseSalary.getFutureSalary(),baseSalary.getRates());
        for (int i = 1; i < year; i++) {
            list.add(nextSalary);
            nextSalary = nextSalary.clone();
        }
        return list;
    }

    public void printListBaseSalary(List<BaseSalary> baseSalaryList) {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(0);
        for (int i = 0; i < baseSalaryList.size(); i++) {

            System.err.println(i + ": " + "BaseSalary: {" +
                    " laterSalary = " + decimalFormat.format(baseSalaryList.get(i).getLaterSalary()) +
                    ", increaseSalary = " + decimalFormat.format(baseSalaryList.get(i).getIncreaseSalary()) +
                    ", nowSalary = " + decimalFormat.format(baseSalaryList.get(i).getNowSalary()) +
                    ", reduceSalary = " + decimalFormat.format(baseSalaryList.get(i).getReduceSalary()) +
                    ", futureSalary = " + decimalFormat.format(baseSalaryList.get(i).getFutureSalary()) +
                    ", rates = " + decimalFormat.format(baseSalaryList.get(i).getRates()) +
                    " }");



        }
    }
}