package test;

import singleton.LazySingleton;

public class test {
    public static void main(String[] args) {
        LazySingleton ls= LazySingleton.getInstance();
        ls.showmessage();
    }
}
