package com.uepb.tcc.racingcar.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b5 = alarme0.isAlarmeLigado();
        boolean b6 = alarme0.isAlarmeLigado();
        boolean b7 = alarme0.isAlarmeLigado();
        boolean b8 = alarme0.isAlarmeLigado();
        boolean b9 = alarme0.isAlarmeLigado();
        boolean b10 = alarme0.isAlarmeLigado();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test02");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b4 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b6 = alarme0.isAlarmeLigado();
        boolean b7 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b10 = alarme0.isAlarmeLigado();
        boolean b11 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b14 = alarme0.isAlarmeLigado();
        boolean b15 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test03");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b5 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b7 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b9 = alarme0.isAlarmeLigado();
        boolean b10 = alarme0.isAlarmeLigado();
        boolean b11 = alarme0.isAlarmeLigado();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test04");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        boolean b4 = alarme0.isAlarmeLigado();
        boolean b5 = alarme0.isAlarmeLigado();
        boolean b6 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b13 = alarme0.isAlarmeLigado();
        boolean b14 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test05");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        alarme0.verifica();
        boolean b2 = alarme0.isAlarmeLigado();
        boolean b3 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b7 = alarme0.isAlarmeLigado();
        boolean b8 = alarme0.isAlarmeLigado();
        boolean b9 = alarme0.isAlarmeLigado();
        boolean b10 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test06");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b8 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b11 = alarme0.isAlarmeLigado();
        boolean b12 = alarme0.isAlarmeLigado();
        boolean b13 = alarme0.isAlarmeLigado();
        boolean b14 = alarme0.isAlarmeLigado();
        boolean b15 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b17 = alarme0.isAlarmeLigado();
        boolean b18 = alarme0.isAlarmeLigado();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test07");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b5 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b7 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test08");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b4 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b6 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b9 = alarme0.isAlarmeLigado();
        boolean b10 = alarme0.isAlarmeLigado();
        boolean b11 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b15 = alarme0.isAlarmeLigado();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test09");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b8 = alarme0.isAlarmeLigado();
        boolean b9 = alarme0.isAlarmeLigado();
        boolean b10 = alarme0.isAlarmeLigado();
        boolean b11 = alarme0.isAlarmeLigado();
        boolean b12 = alarme0.isAlarmeLigado();
        boolean b13 = alarme0.isAlarmeLigado();
        boolean b14 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test10");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        boolean b2 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b5 = alarme0.isAlarmeLigado();
        boolean b6 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b8 = alarme0.isAlarmeLigado();
        boolean b9 = alarme0.isAlarmeLigado();
        boolean b10 = alarme0.isAlarmeLigado();
        boolean b11 = alarme0.isAlarmeLigado();
        boolean b12 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test11");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        alarme0.verifica();
        boolean b2 = alarme0.isAlarmeLigado();
        boolean b3 = alarme0.isAlarmeLigado();
        boolean b4 = alarme0.isAlarmeLigado();
        boolean b5 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b8 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b10 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test12");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        boolean b2 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b6 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b12 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b14 = alarme0.isAlarmeLigado();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test13");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b8 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b10 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b12 = alarme0.isAlarmeLigado();
        boolean b13 = alarme0.isAlarmeLigado();
        boolean b14 = alarme0.isAlarmeLigado();
        boolean b15 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test14");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        boolean b2 = alarme0.isAlarmeLigado();
        boolean b3 = alarme0.isAlarmeLigado();
        boolean b4 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b6 = alarme0.isAlarmeLigado();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test15");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        alarme0.verifica();
        boolean b2 = alarme0.isAlarmeLigado();
        boolean b3 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b5 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b8 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b10 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b12 = alarme0.isAlarmeLigado();
        boolean b13 = alarme0.isAlarmeLigado();
        boolean b14 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test16");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        boolean b4 = alarme0.isAlarmeLigado();
        boolean b5 = alarme0.isAlarmeLigado();
        boolean b6 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b13 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test17");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        alarme0.verifica();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        boolean b4 = alarme0.isAlarmeLigado();
        boolean b5 = alarme0.isAlarmeLigado();
        boolean b6 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b9 = alarme0.isAlarmeLigado();
        boolean b10 = alarme0.isAlarmeLigado();
        boolean b11 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b15 = alarme0.isAlarmeLigado();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test18");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b6 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b11 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b13 = alarme0.isAlarmeLigado();
        boolean b14 = alarme0.isAlarmeLigado();
        boolean b15 = alarme0.isAlarmeLigado();
        boolean b16 = alarme0.isAlarmeLigado();
        boolean b17 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b20 = alarme0.isAlarmeLigado();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test19");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b4 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b6 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b9 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b13 = alarme0.isAlarmeLigado();
        boolean b14 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b16 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test20");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b4 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b8 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b10 = alarme0.isAlarmeLigado();
        boolean b11 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b13 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b15 = alarme0.isAlarmeLigado();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test21");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b6 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b11 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b13 = alarme0.isAlarmeLigado();
        boolean b14 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b16 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b19 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test22");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        boolean b4 = alarme0.isAlarmeLigado();
        boolean b5 = alarme0.isAlarmeLigado();
        boolean b6 = alarme0.isAlarmeLigado();
        boolean b7 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b9 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b12 = alarme0.isAlarmeLigado();
        boolean b13 = alarme0.isAlarmeLigado();
        boolean b14 = alarme0.isAlarmeLigado();
        boolean b15 = alarme0.isAlarmeLigado();
        boolean b16 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test23");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b5 = alarme0.isAlarmeLigado();
        boolean b6 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test24");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b5 = alarme0.isAlarmeLigado();
        boolean b6 = alarme0.isAlarmeLigado();
        boolean b7 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b9 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b11 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test25");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b5 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b8 = alarme0.isAlarmeLigado();
        boolean b9 = alarme0.isAlarmeLigado();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test26");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        alarme0.verifica();
        boolean b2 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b6 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b9 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b12 = alarme0.isAlarmeLigado();
        boolean b13 = alarme0.isAlarmeLigado();
        boolean b14 = alarme0.isAlarmeLigado();
        boolean b15 = alarme0.isAlarmeLigado();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test27");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b4 = alarme0.isAlarmeLigado();
        boolean b5 = alarme0.isAlarmeLigado();
        boolean b6 = alarme0.isAlarmeLigado();
        boolean b7 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b9 = alarme0.isAlarmeLigado();
        boolean b10 = alarme0.isAlarmeLigado();
        boolean b11 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b13 = alarme0.isAlarmeLigado();
        boolean b14 = alarme0.isAlarmeLigado();
        boolean b15 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b17 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test28");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b4 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b6 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b9 = alarme0.isAlarmeLigado();
        boolean b10 = alarme0.isAlarmeLigado();
        boolean b11 = alarme0.isAlarmeLigado();
        boolean b12 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b14 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b16 = alarme0.isAlarmeLigado();
        boolean b17 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b19 = alarme0.isAlarmeLigado();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test29");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        boolean b4 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b6 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b9 = alarme0.isAlarmeLigado();
        boolean b10 = alarme0.isAlarmeLigado();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test30");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        alarme0.verifica();
        boolean b2 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b5 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b7 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b9 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b13 = alarme0.isAlarmeLigado();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test31");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b7 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b10 = alarme0.isAlarmeLigado();
        boolean b11 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b14 = alarme0.isAlarmeLigado();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test32");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        boolean b4 = alarme0.isAlarmeLigado();
        boolean b5 = alarme0.isAlarmeLigado();
        boolean b6 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b9 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b13 = alarme0.isAlarmeLigado();
        boolean b14 = alarme0.isAlarmeLigado();
        boolean b15 = alarme0.isAlarmeLigado();
        boolean b16 = alarme0.isAlarmeLigado();
        boolean b17 = alarme0.isAlarmeLigado();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test33");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        boolean b4 = alarme0.isAlarmeLigado();
        boolean b5 = alarme0.isAlarmeLigado();
        boolean b6 = alarme0.isAlarmeLigado();
        boolean b7 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b9 = alarme0.isAlarmeLigado();
        boolean b10 = alarme0.isAlarmeLigado();
        boolean b11 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b13 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b16 = alarme0.isAlarmeLigado();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test34");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        alarme0.verifica();
        boolean b2 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b5 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b8 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b11 = alarme0.isAlarmeLigado();
        boolean b12 = alarme0.isAlarmeLigado();
        boolean b13 = alarme0.isAlarmeLigado();
        boolean b14 = alarme0.isAlarmeLigado();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test35");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        boolean b4 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b7 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b9 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test36");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b8 = alarme0.isAlarmeLigado();
        boolean b9 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b11 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test37");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b5 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b7 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b9 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test38");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        boolean b4 = alarme0.isAlarmeLigado();
        boolean b5 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b8 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b11 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test39");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b6 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b11 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b16 = alarme0.isAlarmeLigado();
        boolean b17 = alarme0.isAlarmeLigado();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test40");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        boolean b2 = alarme0.isAlarmeLigado();
        boolean b3 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b6 = alarme0.isAlarmeLigado();
        boolean b7 = alarme0.isAlarmeLigado();
        boolean b8 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test41");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        boolean b4 = alarme0.isAlarmeLigado();
        boolean b5 = alarme0.isAlarmeLigado();
        boolean b6 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b10 = alarme0.isAlarmeLigado();
        boolean b11 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b13 = alarme0.isAlarmeLigado();
        boolean b14 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b17 = alarme0.isAlarmeLigado();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test42");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        alarme0.verifica();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        boolean b4 = alarme0.isAlarmeLigado();
        boolean b5 = alarme0.isAlarmeLigado();
        boolean b6 = alarme0.isAlarmeLigado();
        boolean b7 = alarme0.isAlarmeLigado();
        boolean b8 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test43");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b6 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b11 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b15 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b17 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test44");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b9 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b12 = alarme0.isAlarmeLigado();
        boolean b13 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test45");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b6 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b8 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b13 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test46");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        boolean b4 = alarme0.isAlarmeLigado();
        boolean b5 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b8 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b10 = alarme0.isAlarmeLigado();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test47");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b4 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b8 = alarme0.isAlarmeLigado();
        boolean b9 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test48");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        boolean b4 = alarme0.isAlarmeLigado();
        boolean b5 = alarme0.isAlarmeLigado();
        boolean b6 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b10 = alarme0.isAlarmeLigado();
        boolean b11 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b14 = alarme0.isAlarmeLigado();
        boolean b15 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b17 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b19 = alarme0.isAlarmeLigado();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test49");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b6 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b8 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b10 = alarme0.isAlarmeLigado();
        boolean b11 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test50");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b4 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b6 = alarme0.isAlarmeLigado();
        boolean b7 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b9 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b11 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test51");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b4 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b6 = alarme0.isAlarmeLigado();
        boolean b7 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b9 = alarme0.isAlarmeLigado();
        boolean b10 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test52");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        boolean b4 = alarme0.isAlarmeLigado();
        boolean b5 = alarme0.isAlarmeLigado();
        boolean b6 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b9 = alarme0.isAlarmeLigado();
        boolean b10 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b16 = alarme0.isAlarmeLigado();
        boolean b17 = alarme0.isAlarmeLigado();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test53");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b4 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b6 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b9 = alarme0.isAlarmeLigado();
        boolean b10 = alarme0.isAlarmeLigado();
        boolean b11 = alarme0.isAlarmeLigado();
        boolean b12 = alarme0.isAlarmeLigado();
        boolean b13 = alarme0.isAlarmeLigado();
        boolean b14 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b16 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test54");
        com.uepb.tcc.racingcar.Alarme alarme0 = new com.uepb.tcc.racingcar.Alarme();
        boolean b1 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        boolean b3 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        boolean b6 = alarme0.isAlarmeLigado();
        boolean b7 = alarme0.isAlarmeLigado();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        alarme0.verifica();
        boolean b14 = alarme0.isAlarmeLigado();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b14 == true);
    }
}

