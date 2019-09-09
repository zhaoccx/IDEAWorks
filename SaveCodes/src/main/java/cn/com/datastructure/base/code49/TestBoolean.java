package cn.com.datastructure.base.code49;

/**
 * @author zhaocc
 */
public class TestBoolean {
    public static void main(String[] args) {
        //Boolean bool = new Boolean("true");
        Boolean bool1 = Boolean.valueOf("true");
        Boolean bool2 = Boolean.valueOf("true");
        // bool1 == bool2;
        System.out.println(bool1.equals(bool2));
    }
}