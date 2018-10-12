package com.kwankee.quantum;

import org.junit.Assert;
import org.junit.Test;

public class testQuantumState {

    @Test
    public void testSinglet() {
        QuantumState state = QuantumStatePreparer.prepareKetState(new double[]{1., 1.});
        Assert.assertEquals(Math.sqrt(0.5), state.getCoef(0), 1e-4);
        Assert.assertEquals(Math.sqrt(0.5), state.getCoef(1), 1e-4);
    }
}
