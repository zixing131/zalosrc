package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* loaded from: classes2.dex */
public abstract class ea3 {

    /* renamed from: a */
    private static final OutputStream f19573a = new da3();

    /* renamed from: a */
    public static byte[] m21652a(InputStream inputStream) {
        int i11;
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int highestOneBit = Integer.highestOneBit(0);
        int min = Math.min(8192, Math.max(128, highestOneBit + highestOneBit));
        int i12 = 0;
        while (i12 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i12);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i13 = 0;
            while (i13 < min2) {
                int read = inputStream.read(bArr, i13, min2 - i13);
                if (read == -1) {
                    return m21653b(arrayDeque, i12);
                }
                i13 += read;
                i12 += read;
            }
            if (min < 4096) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            min = ha3.m22774c(min * i11);
        }
        if (inputStream.read() == -1) {
            return m21653b(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: b */
    private static byte[] m21653b(Queue queue, int i11) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i11) {
            return bArr;
        }
        int i12 = i11 - length;
        byte[] copyOf = Arrays.copyOf(bArr, i11);
        while (i12 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(i12, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i11 - i12, min);
            i12 -= min;
        }
        return copyOf;
    }
}
