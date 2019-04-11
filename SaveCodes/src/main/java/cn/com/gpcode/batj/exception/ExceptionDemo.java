package cn.com.gpcode.batj.exception;

import java.util.HashMap;
import java.util.Map;

public class ExceptionDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("one", "One");
        System.out.println(map.get("one"));

        // throw new SQLException("xxxx");
        //throw new RuntimeException("xxxxxxxxxxxx");


    }
}
