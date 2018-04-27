/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 18 18:09:46 GMT 2018
 */

package com.uepb.tcc.racingcar.evosuite;

import org.junit.Test;
import static org.junit.Assert.*;
import com.uepb.tcc.racingcar.BilheteDeTurno;
import com.uepb.tcc.racingcar.DistribuidorDeBilhete;
import com.uepb.tcc.racingcar.NumeroSequenciaTurno;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

//@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DistribuidorDeBilhete_ESTest extends DistribuidorDeBilhete_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DistribuidorDeBilhete distribuidorDeBilhete0 = new DistribuidorDeBilhete();
      NumeroSequenciaTurno.getProximoNumero();
      BilheteDeTurno bilheteDeTurno0 = distribuidorDeBilhete0.getTurnTicket();
      assertEquals(1, bilheteDeTurno0.getNumeroTurno());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DistribuidorDeBilhete distribuidorDeBilhete0 = new DistribuidorDeBilhete();
      BilheteDeTurno bilheteDeTurno0 = distribuidorDeBilhete0.getTurnTicket();
      assertEquals(0, bilheteDeTurno0.getNumeroTurno());
  }
}
