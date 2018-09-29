package cn.com.datastructure.base.code1;

public class TestChange {
    public static void main(String[] args) {
        double dVar = 3.651242424242424D;
        System.out.println(dVar);
        float fVar = 4.5f;
        System.out.println(fVar);
        int iVar = 34;
        System.out.println(iVar);
        long lVar = 3456000000000000000L;
        System.out.println(lVar);
        short sVar = 3;
        System.out.println(sVar);

        fVar = (float) dVar;
        System.out.println(fVar);
    }
}