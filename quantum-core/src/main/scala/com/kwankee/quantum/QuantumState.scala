package com.kwankee.quantum

import org.nd4j.linalg.factory.Nd4j

class QuantumState(nbStates : Int = 2) {
  var state = Nd4j.rand(nbStates, 1)

  def norm() : Double =
    Math.sqrt(Range(0, nbStates)
      .map(i => state.getDouble(i, 0)*state.getDouble(i, 0))
      .reduce((a, b) => a+b))

  def normalize() : Unit = {
    val normval = norm()
    Range(0, nbStates).foreach(i => state.putScalar(i, 0, state.getDouble(i, 0) / normval))
  }

  def getCoef(i :Int) : Double = state.getDouble(i, 0)
}
