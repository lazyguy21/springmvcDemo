package com.cddaka.springmvcDemo;

/**
 * Created by lazyguy on 2016-4-15.
 */
public class T {
    public static void main(String[] args) {
        String s = new String("abc");
        String s1 = "abc";
        System.out.println(s.equals(s1));
        System.out.println(s==s1);
        System.out.println(s.hashCode()==s1.hashCode());
//        "asdf"
    }
}
