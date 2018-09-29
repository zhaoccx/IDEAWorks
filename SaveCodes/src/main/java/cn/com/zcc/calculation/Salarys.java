package cn.com.zcc.calculation;

public class Salarys {

    private Integer year;//第几年
    private Double allSalarys;//总金额
    private Integer averageMenthy;//平均月份
    private Double averageSalary;//每月平均利息
    private Double initSalary;//上年总金额
    private Double interest;//当年总利息

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getAllSalarys() {
        return allSalarys;
    }

    public void setAllSalarys(Double allSalarys) {
        this.allSalarys = allSalarys;
    }

    public Integer getAverageMenthy() {
        return averageMenthy;
    }

    public void setAverageMenthy(Integer averageMenthy) {
        this.averageMenthy = averageMenthy;
    }

    public Double getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(Double averageSalary) {
        this.averageSalary = averageSalary;
    }

    public Double getInitSalary() {
        return initSalary;
    }

    public void setInitSalary(Double initSalary) {
        this.initSalary = initSalary;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "{" +
                "第" + year +
                "年, 总金额=" + allSalarys +
                ", 平均月份=" + averageMenthy +
                ", 每月平均利息=" + averageSalary +
                ", 上年总金额=" + initSalary +
                ", 当年总利息=" + interest +
                '}';
    }

    public Salarys() {
    }

    /**
     * @param year       年份
     * @param allSalarys 当年总金额
     * @param initSalary 上年总金额
     */
    public Salarys(Integer year, Double allSalarys, Double initSalary) {
        this.year = year;
        this.allSalarys = allSalarys;
        this.initSalary = initSalary;
        if (null == this.getAverageMenthy()) {
            this.setAverageMenthy(12);
        }

        this.setInterest(this.getAllSalarys() - this.getInitSalary());
        this.setAverageSalary(this.getInterest() / this.getAverageMenthy());

    }

    public Salarys(Integer year, Double allSalarys, Integer averageMenthy, Double initSalary) {
        this.year = year;
        this.allSalarys = allSalarys;
        this.averageMenthy = averageMenthy;
        this.initSalary = initSalary;
        this.setInterest(this.getAllSalarys() - this.getInitSalary());
        this.setAverageSalary(this.getInterest() / this.getAverageMenthy());
    }
}
