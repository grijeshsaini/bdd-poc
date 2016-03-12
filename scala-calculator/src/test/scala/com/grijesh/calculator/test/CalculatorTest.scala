package com.grijesh.calculator.test

import com.grijesh.calculator.Calculator
import cucumber.api.scala.{ScalaDsl, EN}
import org.junit.Assert._

/**
  * Created by grijesh on 13/3/16.
  */
class CalculatorTest extends ScalaDsl with EN{

  private var calc:Calculator = null

  Given("""^Calculator is turned on$"""){ () =>
    calc = new Calculator
  }
  When("""^I add (.+)$"""){ (a:Double) =>
    calc add a
  }
  When("""^add (.+)$"""){ (b:Double) =>
    calc add b
  }
  Then("""^result should be (.+)$"""){ (result:Double) =>
    assertTrue(calc.result.equals(result))
  }
  When("""^subtract (.+)$"""){ (a:Double) =>
    calc subtract a
  }

}
