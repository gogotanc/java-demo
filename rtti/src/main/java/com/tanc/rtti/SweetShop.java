package com.tanc.rtti;

/**
 * 类加载相关示例
 * Created by tanc on 17-4-25.
 */
public class SweetShop {

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("inside main");
        new Candy();
        System.out.println("after creating candy");
        Class.forName("com.tanc.rtti.Gum");
        System.out.println("after Class.forName(\"com.tanc.rtti.Gum\")");
        new Cookie();
        System.out.println("after creating cookie");
    }
}

class Candy {

    static {System.out.println("Loading candy");}
}

class Gum {

    static {System.out.println("Loading gum");}
}

class Cookie {

    static {System.out.println("Loading cookie");}
}