package org.tanc.reflect;

import org.junit.Test;

/**
 * 测试 打印类信息的工具类
 * Created by tanc on 2017/4/12.
 */
public class ShowClassTest {

    @Test
    public void case1() throws Exception {
        ShowClass.printAllMessage("String");
    }

    @Test
    public void case2() throws Exception {
        ShowClass.printFieldMessage(2);
    }

    @Test
    public void case3() throws Exception {
        ShowClass.printMethodMessage(3);
    }

    @Test
    public void case4() throws Exception {
        ShowClass.printConstructorMessage(3);
    }
}