package cn.com.zcc.calculation;

/**
 * TODO 请简单的注释说明类 BaseSalary 的作用
 *
 * @author zhaocc
 * @date 2020/8/13 14:33
 */
public class BaseSalary implements Cloneable {
    /**
     * 上年度金额
     */
    private double laterSalary;
    /**
     * 本年度金额
     */
    private double nowSalary;
    /**
     * 下年度金额
     */
    private double futureSalary;
    /**
     * 利率
     */
    private double rates;

    /**
     * 增加金额
     */
    private double increaseSalary;
    /**
     * 减少金额
     */
    private double reduceSalary;

    public double getIncreaseSalary() {
        return increaseSalary;
    }

    public void setIncreaseSalary(double increaseSalary) {
        this.increaseSalary = increaseSalary;
    }

    public double getReduceSalary() {
        return reduceSalary;
    }

    public void setReduceSalary(double reduceSalary) {
        this.reduceSalary = reduceSalary;
    }

    public double getLaterSalary() {
        return laterSalary;
    }

    public void setLaterSalary(double laterSalary) {
        this.laterSalary = laterSalary;
    }

    public double getNowSalary() {
        return nowSalary;
    }

    public void setNowSalary(double nowSalary) {
        this.nowSalary = nowSalary;
        this.laterSalary = nowSalary * (100 - rates) / 100;
        this.futureSalary = nowSalary * (100 + rates) / 100;
        this.increaseSalary = futureSalary - nowSalary;
        this.reduceSalary = nowSalary - laterSalary;
    }

    public double getFutureSalary() {
        return futureSalary;
    }

    public void setFutureSalary(double futureSalary) {
        this.futureSalary = futureSalary;
    }

    public double getRates() {
        return rates;
    }

    public void setRates(double rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "BaseSalary { " +
                "laterSalary = " + laterSalary +
                ", nowSalary = " + nowSalary +
                ", futureSalary = " + futureSalary +
                ", rates = " + rates +
                ", increaseSalary = " + increaseSalary +
                ", reduceSalary = " + reduceSalary +
                " } ";
    }

    public BaseSalary() {
    }

    @Override
    protected BaseSalary clone() {
        return new BaseSalary(futureSalary, rates);
    }

    /**
     * @param nowSalary 本金
     * @param rates     利率
     */
    public BaseSalary(double nowSalary, double rates) {
        this.nowSalary = nowSalary;
        this.rates = rates;
        this.laterSalary = nowSalary * (100 - rates) / 100;
        this.futureSalary = nowSalary * (100 + rates) / 100;
        this.increaseSalary = futureSalary - nowSalary;
        this.reduceSalary = nowSalary - laterSalary;
    }

    public static void main(String[] args) {
        BaseSalary baseSalary = new BaseSalary(5800D, 5D);
        System.out.println(baseSalary);
    }
}