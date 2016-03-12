package com.grijesh.calculator

/**
  * Created by grijesh on 13/3/16.
  */
class Calculator{

  private var currentState:Double = 0

  def add(a:Double) = currentState = currentState + a

  def subtract(a:Double) = currentState = currentState - a

  def reset = currentState = 0

  def result = currentState

}
