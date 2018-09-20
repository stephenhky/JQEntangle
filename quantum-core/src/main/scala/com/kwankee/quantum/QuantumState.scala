package com.kwankee.quantum

import org.nd4j.linalg.factory.Nd4j

class QuantumState(nbStates : Int = 2) {
  var states = Nd4j.rand(nbStates, 1)

  def norm() : Double =
    Math.sqrt(Range(0, nbStates)
      .map(i => states.getDouble(i, 0)*states.getDouble(i, 0))
      .reduce((a, b) => a+b))

  def normalize() : Unit = {
    val norm = norm()
    Range(0, nbStates).foreach(i => states.putScalar(i, 0, states.getDouble(i, 0) / norm))
  }
}
