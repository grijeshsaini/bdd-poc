package com.grijesh.calculator.test

/**
  * Created by grijesh on 13/3/16.
  */

import cucumber.api.CucumberOptions
import org.junit.runner.RunWith
import cucumber.api.junit.Cucumber

@RunWith(classOf[Cucumber])
@CucumberOptions(
  monochrome = true,
  features = Array("src/test/resources/features/"),
  plugin = Array("pretty", "html:build/results"),
  dryRun = false,
  glue = Array("com.grijesh.calculator.test")
)
class BddRunner
