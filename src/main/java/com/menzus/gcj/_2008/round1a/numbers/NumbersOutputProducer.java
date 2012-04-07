package com.menzus.gcj._2008.round1a.numbers;

import com.menzus.gcj.common.OutputProducer;

public class NumbersOutputProducer implements OutputProducer<NumbersInput, NumbersOutput> {
    @Override
    public NumbersOutput produceOutput(NumbersInput input) {
	int[][] a_0 = { { 3, 5 }, { 1, 3 } };
	int[][] a_n = fastExponentiation(a_0, input.getN());
	int lastThreeIntegerDigits = (2 * a_n[0][0] + 999) % 1000;
	return new NumbersOutput(lastThreeIntegerDigits);
    }

    private int[][] simpleMatrixMultiplication(int[][] a, int[][] b) {
	int[][] c = { { 0, 0 }, { 0, 0 } };
	for (int i = 0; i < 2; i++) {
	    for (int j = 0; j < 2; j++) {
		for (int k = 0; k < 2; k++) {
		    c[i][k] = (c[i][k] + a[i][j] * b[j][k]) % 1000;
		}
	    }
	}
	return c;
    }

    private int[][] fastExponentiation(int[][] a, int n) {
	if (n == 1) {
	    return a;
	} else {
	    if (n % 2 == 0) {
		int[][] b = fastExponentiation(a, n / 2);
		return simpleMatrixMultiplication(b, b);
	    } else {
		return simpleMatrixMultiplication(a, fastExponentiation(a, n - 1));
	    }
	}
    }
}
