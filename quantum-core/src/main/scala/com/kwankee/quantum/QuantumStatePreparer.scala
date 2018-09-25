package com.kwankee.quantum

object QuantumStatePreparer {

  def prepareKetState(doublearray: Array[Double]) : QuantumState = {
    var quantumState = new QuantumState(nbStates = doublearray.length)
    Range(0, doublearray.length).foreach( i => quantumState.state.putScalar(i, 0, doublearray(i)))
    quantumState.normalize()

    quantumState
  }

}
