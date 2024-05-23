package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class w73 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m27576b(int i11, int i12) {
        int i13 = i11 + (i11 >> 1) + 1;
        if (i13 < i12) {
            int highestOneBit = Integer.highestOneBit(i12 - 1);
            i13 = highestOneBit + highestOneBit;
        }
        if (i13 < 0) {
            return Integer.MAX_VALUE;
        }
        return i13;
    }

    /* renamed from: a */
    public abstract w73 mo22297a(Object obj);
}
