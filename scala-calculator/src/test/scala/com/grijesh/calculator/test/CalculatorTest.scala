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
  When("""^I add (\d+)$"""){ (a:Int) =>
    calc add a
  }
  When("""^add (\d+)$"""){ (b:Int) =>
    calc add b
  }
  Then("""^result should be (\d+)$"""){ (result:Int) =>
    assertEquals(result, calc result)
  }
  When("""^subtract (\d+)$"""){ (a:Int) =>
    calc subtract a
  }
  When("""^add (\d+).(\d+)$"""){ (a:Int, b:Int) =>
    //// Express the Regexp above with the code you wish you had
  }
  Then("""^result should be (\d+).(\d+)$"""){ (a:Int, b:Int) =>
    //// Express the Regexp above with the code you wish you had
  }

}
