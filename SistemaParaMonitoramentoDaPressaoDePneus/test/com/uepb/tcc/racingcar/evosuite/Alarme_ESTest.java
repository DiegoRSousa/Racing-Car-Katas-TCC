/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 17 23:48:06 GMT 2018
 */

package com.uepb.tcc.racingcar.evosuite;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.uepb.tcc.racingcar.Alarme;
import com.uepb.tcc.racingcar.Sensor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

//@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Alarme_ESTest extends Alarme_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Alarme alarme0 = new Alarme();
      assertFalse(alarme0.isAlarmeLigado());
      
      alarme0.verifica();
      boolean boolean0 = alarme0.isAlarmeLigado();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Alarme alarme0 = new Alarme();
      Sensor sensor0 = new Sensor();
      alarme0.sensor = sensor0;
      alarme0.sensor = sensor0;
      alarme0.sensor = null;
      // Undeclared exception!
      try { 
        alarme0.verifica();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.uepb.tcc.racingcar.Alarme", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Alarme alarme0 = new Alarme();
      assertFalse(alarme0.isAlarmeLigado());
      
      alarme0.verifica();
      alarme0.verifica();
      alarme0.verifica();
      assertTrue(alarme0.isAlarmeLigado());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Alarme alarme0 = new Alarme();
      boolean boolean0 = alarme0.isAlarmeLigado();
      assertFalse(boolean0);
  }
}
