package com.zing.zalo.stickersuggestion.topic;

import fn0.AbstractC19074t;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class TensorShapeMismatchException extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TensorShapeMismatchException(int[] iArr, int[] iArr2) {
        super(r0.toString());
        AbstractC19074t.m100208f(iArr, "previousOutputShape");
        AbstractC19074t.m100208f(iArr2, "inputShape");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error trying to pass an input with shape ");
        String arrays = Arrays.toString(iArr);
        AbstractC19074t.m100207e(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        sb2.append(" to an array with shape ");
        String arrays2 = Arrays.toString(iArr2);
        AbstractC19074t.m100207e(arrays2, "java.util.Arrays.toString(this)");
        sb2.append(arrays2);
    }
}
